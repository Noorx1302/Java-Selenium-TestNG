package day12;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("On start");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
		  }
	  
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
		  }
	  
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped");
		  }
	  
	public void onFinish(ITestContext context) {
		System.out.println("On test finish");
	}
	  
	
	
}
