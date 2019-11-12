package Chck_boxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chck_boxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		String chck="option3";
				
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
		
		//System.out.println(li.size());
		
		for(int i=0;i<li.size();i++)
		{
			
			String str=li.get(i).getAttribute("value");
			
			//System.out.println(str);
			
			if(str.equals(chck))
			{
				li.get(i).click();
				break;
			}
		}
		
		
		
	}

}
