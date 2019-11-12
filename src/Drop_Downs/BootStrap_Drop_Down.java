package Drop_Downs;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrap_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
	    List<WebElement> ddmenu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a "));
	 
	    System.out.println(ddmenu.size());
	    
	   for(int i=0;i<ddmenu.size();i++)
	   {
		 System.out.println(ddmenu.get(i).getText());
		 if(ddmenu.get(i).getText().equals("CSS"))
		   {
			   ddmenu.get(i).click();
			  
		   }  
	   }
	  
	}

}
