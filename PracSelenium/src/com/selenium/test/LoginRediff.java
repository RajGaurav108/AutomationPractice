package com.selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRediff {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();

		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		saveScreenshot("rediffloginpage");
		
//		driver.get("https://tutorial.techaltum.com/htmlform.html");
		
		driver.findElement(By.id("login1")).sendKeys("ram@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("pwd@1234");
		saveScreenshot("userdetails");
		
		driver.findElement(By.name("proceed")).click();
		saveScreenshot("postlogin");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		
		if (!checkBox.isSelected()) {
			checkBox.click();
		}
		saveScreenshot("checkbox selection");
	

	}

	private static void saveScreenshot(String fileName) {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File tmpSS = screenshot.getScreenshotAs(OutputType.FILE);
		File fileSS = new File("C:\\EclipseSS\\"+fileName+".jpg");
		try {
			fileSS.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			FileUtils.copyFile(tmpSS, fileSS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
