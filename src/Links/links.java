package Links;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class links {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	    WebElement footer=driver.findElement(By.id("gf-BIG"));
	    
	    System.out.println(footer.findElements(By.tagName("a")).size());
	    
	   WebElement coulumn= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    
	  System.out.println(coulumn.findElements(By.tagName("a")).size());
		
	  
	  for(int i=1;i<coulumn.findElements(By.tagName("a")).size();i++)
	  {
		  
		 String click= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		 coulumn.findElements(By.tagName("a")).get(i).sendKeys(click);
		 
		 //WebDriverWait wait=new WebDriverWait(driver,10);
		 
		 //wait.until(ExpectedConditions.elementToBeSelected(element))
		 
	  }
	  
	   Set<String> win=driver.getWindowHandles();
		 
	    for(String l:win)
	    {
	    	String str=driver.switchTo().window(l).getTitle();
	    	//System.out.println(str);
	    	
	    	if(str.equalsIgnoreCase("The World's Most Popular API Testing Tool | SoapUI"))
	    	{
	    		driver.close();
	    	}
	    }
	}

}
