package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
		
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		driver.switchTo().alert().sendKeys("Rajesh Reddy");
		driver.switchTo().alert().accept();
	    WebElement msg=	driver.findElement(By.id("result"));
	    System.out.println(msg.getText());

	}

}
