package Drop_Downs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("dropdown-class-example"));
		
	    Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
	   
	    sel.selectByVisibleText("Option2");
	
	  
	  
	}

}
