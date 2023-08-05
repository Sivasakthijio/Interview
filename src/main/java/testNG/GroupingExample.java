package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"sanity"})
	void test1() {
		System.out.println("class GroupingExample.test1 method ");
	}
	
	@Test(groups = {"smoke"})
	void test2() {
		System.out.println("class GroupingExample.test2 method ");
	}
	
	@Test(groups = {"smoke"})
	void test3() {
		System.out.println("class GroupingExample.test3 method ");
	}
	
	@Test(groups = {"sanity"})
	void test4() {
		System.out.println("class GroupingExample.test4 method ");
	}
	
	@Test(groups = {"Regression"})
	void test5() {
		System.out.println("class GroupingExample.test5 method ");
	}
	
	@Test(groups = {"Regression"})
	void test6() {
		System.out.println("class GroupingExample.test6 method ");
	}

}
