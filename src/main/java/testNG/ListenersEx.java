package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListener.class)
public class ListenersEx {
	@Test
	public void test1() {
		System.out.println("This is from test1 methods");
	}
	@Test
	public void test2() {
		System.out.println("This is from test2 methods");
		Assert.assertEquals("siva", "pavi");
		
	}
	@Test
	public void test3() {
		System.out.println("This is from test3 methods");
		throw new SkipException("This is new skip exception");
	}

}
