package com.listeners;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport {
	ExtentTest logger;
	ExtentReports report;
	WebDriver driver;

	@BeforeTest
	public void startReport() {
		report=new ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReport1.html");
		System.out.println(System.getProperty("user.dir")+"//test-output//ExtentReport1.html");
		report.addSystemInfo("Host Name","CISCO");
		report.addSystemInfo("Environment","Testing");
		report.addSystemInfo("User Name","Raj Gaurav");
		report.loadConfig(new File(System.getProperty("user.dir")+"//extent-config.xml"));

	}
	@Test
	public void open_swiggy_url() {
		logger = report.startTest("Open Url");
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_96\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "Open URL Has Been Passed");
		report.endTest(logger);
	}
	@Test(dependsOnMethods = "open_swiggy_url")
	public void LocateMe() {	  
		logger = report.startTest("locates_me");
		driver.findElement(By.xpath("//span[@class='LukWG']")).click();
		logger.log(LogStatus.PASS, "Locate Me Has Been Passed");
		report.endTest(logger);
	}
	@Test(dependsOnMethods = "locates_me")
	public void SearchItem() {	  
		logger = report.startTest("Search Item");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys("Aaloo Paratha");
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys(Keys.ENTER);
		logger.log(LogStatus.PASS, "Search Item Has Been Passed");
		report.endTest(logger);
	}
	@Test(dependsOnMethods = "SearchItem")
	public void SelectingItemOptions() {	  
		logger = report.startTest("Selecting Item From Options");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[normalize-space()='KHEER MAHAL']")).click();
		logger.log(LogStatus.PASS, "Selecting Item From Options Has Been Passed");
		report.endTest(logger);
	}
	@Test(dependsOnMethods = "SelectingItemOptions")
	public void AddtoCart() {	  
		logger = report.startTest("Adding Item to Cart");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[@class='_1gPB7']")).click();
		logger.log(LogStatus.PASS, "Adding Item to Cart Has Been Passed");
		report.endTest(logger);
	}
	@AfterTest
	public void endReport() {
		report.flush();
		report.close();

	}


}
