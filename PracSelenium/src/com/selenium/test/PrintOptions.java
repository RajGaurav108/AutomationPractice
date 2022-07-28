package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintOptions {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		
		List<WebElement> lstSelects = driver.findElements(By.tagName("select"));
		
		System.out.println("Number Of Selects");
		System.out.println(lstSelects.size());
		WebElement select1 = lstSelects.get(0);
		WebElement select = driver.findElements(By.tagName("select")).get(0);
		List<WebElement> lstoptions = select.findElements(By.tagName("option"));
		System.out.println(lstoptions.size());
		for(WebElement option : lstoptions) {
			System.out.println(option.getText());
		}
		driver.close();

	}

}
