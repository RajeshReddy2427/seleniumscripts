package Resize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {

	public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/testng/testng_basic_annotations.htm");
		
		System.out.println(driver.manage().window().getSize());
		
         Dimension d=new Dimension(240,120);
         
         driver.manage().window().setSize(d);
	}

}
