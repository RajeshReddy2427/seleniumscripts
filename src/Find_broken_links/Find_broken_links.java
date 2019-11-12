package Find_broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_broken_links {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
	     List<WebElement> links=driver.findElements(By.tagName("a"));
		
		  for(int i=1;i<links.size();i++)
		  {
			 WebElement element= links.get(i);
			 
			String url= element.getAttribute("href");
			
			URL link=new URL(url);
			
			  
			  HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			  
			  httpconn.connect();
			  
			  if(httpconn.getResponseCode()>=400)
			  {
				  System.out.println("It is broken link:"+url);
			  }
			  else
			  {
				  System.out.println("It is valid link:"+url);
				  
			  }
			  
			  
		  }
		  
	
	
		
		
		
		
		
		

	}

}
