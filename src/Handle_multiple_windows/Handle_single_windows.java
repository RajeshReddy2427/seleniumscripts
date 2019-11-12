package Handle_multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_single_windows {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-info'] [contains(text(),'    click   ')]")).click();
		
		Set<String> win=driver.getWindowHandles();
		
		for(String l:win)
		{
			String text=driver.switchTo().window(l).getTitle();
			
			System.out.println(text);
		}
		
		
		
		
	}

}
