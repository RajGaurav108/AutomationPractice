package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_95\\chromedriver.exe");
//      C:\DownloadedApp\chromedriver_win32_95\chromedriver.exe
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorial.techaltum.com/htmlform.html");
		Thread.sleep(5000);
		driver.findElement(By.id("b")).sendKeys("");
		driver.findElement(By.id("b")).click();
		
	}

}
