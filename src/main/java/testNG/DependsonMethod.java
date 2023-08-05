package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	
	
	//1st try to run without dependsOnMethod, alwaysRun
	//2nd run only with depends on method
	//3rd try to run with dependsOnMethod, alwaysRun
	
	@Test(dependsOnMethods = {"testMethod1"},alwaysRun = true)
	public void testMethod() {
		System.out.println("This method from TestCase1 class");
	}
	
	@Test()
	public void testMethod1() {
		System.out.println("This method from TestCase2 class");
		Assert.fail();
	}
}
