package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}
   
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Failed");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext result) {
		System.out.println(result.getName()+" Started");

	}

	public void onFinish(ITestContext context) {
		
	}
	

}
