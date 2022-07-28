package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_95\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorial.techaltum.com/htmlform.html");
		
		List<WebElement> lstLinks = driver.findElements(By.tagName("a"));
		System.out.println(lstLinks.size());
		
//		List<WebElement> elemnB = driver.findElements(By.id("b"));
//		System.out.println(elemnB.size());
		
		for (int i = 0; i < lstLinks.size();i++) {
			System.out.println(lstLinks.get(i).getText());
		}
		

	}

}
