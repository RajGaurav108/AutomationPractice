package com.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver;

	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32\\chromedriver.exe");
	}
	@Test
	public void Test() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		//Locate me
		driver.findElement(By.className("LukWG")).click();
		//Search
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		//Enter item name
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("PIZZA");
		//click on item
		driver.findElement(By.xpath("//i[@class='icon-magnifier _1F77L']")).click();
		//selecting options
		driver.findElement(By.xpath("//div/span/span[text()='Sweet Corns ']")).click();
		//click on image
		driver.findElement(By.xpath("//div/button[@aria-label='See more information about Sweet Corns Pizza']")).click();
		//add to cart
		driver.findElement(By.xpath("//div/div[@class='F8dpS styles_addBtnDwebReset__2Q6BN _3L1X9']")).click();
		//opening cart
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();

	}
}
