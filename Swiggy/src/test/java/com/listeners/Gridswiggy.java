package com.listeners;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Gridswiggy {


	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32\\chromedriver.exe");
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");

		driver = new RemoteWebDriver(url,capabilities);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		//user click on Locate me
		driver.findElement(By.className("LukWG")).click();
		//click on Search
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
		//Enter the item name
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("PIZZA");
		//user click on item
		driver.findElement(By.xpath("//i[@class='icon-magnifier _1F77L']")).click();
		//user selecting different options
		driver.findElement(By.xpath("//div/span/span[text()='Sweet Corns ']")).click();
		//user click on image
		driver.findElement(By.xpath("//div/button[@aria-label='See more information about Sweet Corns Pizza']")).click();
		//user add to cart
		driver.findElement(By.xpath("//div/div[@class='F8dpS styles_addBtnDwebReset__2Q6BN _3L1X9']")).click();
		//user opening cart
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();}
}
