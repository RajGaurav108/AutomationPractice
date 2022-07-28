package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	WebDriver driver;
	By username = By.id("login1");
	By password = By.id("password");
	By proceed = By.name("proceed");
	
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		this.driver = driver;
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("ram@gmail.com");
		driver.findElement(By.id("password")).sendKeys("pwd@1234");
		driver.findElement(By.name("proceed")).click();
	}
	
	public void Compose() {
		driver.findElement(By.id("compose")).click();
		driver.findElement(By.id("to")).sendKeys("yeah");
		driver.findElement(By.name("subject")).sendKeys("Same Subject");
		driver.findElement(By.name("send")).click();
	}
	
	
	public void Clear() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		
	}

}
