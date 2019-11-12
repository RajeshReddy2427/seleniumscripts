package Handle_multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_seperate_window {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary'] [contains(text(),'click')]")).click();
		
		Set<String> win=driver.getWindowHandles();
		
		
		for(String l:win)
		{
			String str=driver.switchTo().window(l).getTitle();
			
			if(str.equals("Sakinalium | Home"))
			{
				driver.close();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
