package com.extent;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestReport {
	
	ExtentTest logger;
	
//	ExtentReports extent;
	ExtentReports report;
	
	@BeforeTest
	public void startReport() {
//		extent = new ExtentReports();
		report = new ExtentReports(System.getProperty("user.dir")+"\\test-output\\ExtentReport.html");
		System.out.println(System.getProperty("user.dir")+"\\test-output\\ExtentReport.html");
		
		report.addSystemInfo("HostName", "CISCO");
		report.addSystemInfo("Environment", "TESTING");
		report.addSystemInfo("User Name", "Raj Gaurav");
		
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	
  @Test
  public void testPass() {
	  System.out.println("Testing");
	  System.out.println(System.getProperty("user.dir"));
	  logger = report.startTest("Order Product");
	  logger.log(LogStatus.PASS, "Order Product Has Passed");
	  report.endTest(logger);
  }
  
  @Test
  public void testSkip() {
	  System.out.println("Testing");
  	  logger = report.startTest("Cancel Order");
	  logger.log(LogStatus.SKIP, "Cancel Order Has Skipped");
	  report.endTest(logger);
  }
  
  @Test
  public void testFail() {
	  System.out.println("Testing");
  	  logger = report.startTest("Pay for Order");
	  logger.log(LogStatus.FAIL, "Payment Has Failed");
	  report.endTest(logger);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");
  }
  @AfterTest
  public void endReport() {
	report.flush();
	report.close();
}

}
