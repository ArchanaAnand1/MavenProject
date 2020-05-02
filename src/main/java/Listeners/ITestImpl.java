package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestImpl extends ExtentReportsListener implements ITestListener{
	
	private static ExtentReports extent;

	public void onFinish(ITestContext arg0) {
		System.out.println("Completed the listener");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Started the listener");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		extent = setUp();
		
	}

	public void onTestSuccess(ITestResult arg0) {
	extent.flush();
	System.out.println("Generate repot");
		
	}

}
