package Radio_buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
		String radio= "radio3";
		List<WebElement> list=driver.findElements(By.xpath("//input[@class='radioButton']"));
		
		//System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getAttribute("value");
			
			//System.out.println(str);
			
			if(str.equals(radio))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		

	}

}
