package chatGPT;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestListener implements ITestListener {

	private ExtentReports extent;
    private ExtentTest test;

    
    public void onStart(ITestContext context) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test passed");
    }

    
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test failed");
    }

    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test skipped");
    }
}
