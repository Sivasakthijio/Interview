package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName());
	}

	
}
