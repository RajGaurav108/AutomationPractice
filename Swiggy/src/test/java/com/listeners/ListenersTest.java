package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Failed");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" Started");

	}

	public void onFinish(ITestContext context) {

	}

}
