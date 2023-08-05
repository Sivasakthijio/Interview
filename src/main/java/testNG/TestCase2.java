package testNG;


import org.testng.annotations.Test;

public class TestCase2 extends AnotationsEx{

	@Test(priority = 0)
	public void testMethod() {
		System.out.println("This method from TestCase1 class");
	}
	
	@Test(priority = 1,enabled = false)
	public void testMethod1() {
		System.out.println("This method from TestCase2 class");
		//Assert.assertEquals(1, 2);
		}
}
