package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void testcase1()
	{
		
		System.out.println("Iam the test case1");
	}
	
	@Test()
	
	public void testcase2()
	{
		
		System.out.println("Iam the second test case 2");
	}
	
	@BeforeTest
	
	public void beforetest() {
		
		System.out.println("this is the before test");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		
		System.out.println("Iam the after test");
	}
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("iam the before method");
	}
	
	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("iam after method");
	}
	
	@BeforeClass
	
	public void beforeclass()
	{
		
		System.out.println("Before class");
	}
	@AfterClass
	
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@BeforeSuite
	
	public void beforesuite()
	
	{
		
		System.out.println("before suite");
	}
	
	@AfterSuite
	
	public void aftersuite()
	{
		System.out.println("After suite");
	}
}
