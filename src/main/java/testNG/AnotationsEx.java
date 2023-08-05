package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationsEx {
	
	@Test(priority = 1)
	public void testMethod() {
		System.out.println("This method from test1");
	}
	
	@Test(priority = 0)
	public void testMethod1() {
		System.out.println("This method from test2");
	}
	
	@Test(priority = -1)
	public void testMethod2() {
		System.out.println("This method from test3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method from BeforeMethod");	
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method from afterMethod");	
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This method from BeforeClass");	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This method from afterClass");	
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This method from BeforeTest");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This method from afterTest");	
	}
	
	

}
