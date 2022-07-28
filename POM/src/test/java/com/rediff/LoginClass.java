package com.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	
		WebDriver driver;
		
		By username = By.id("login1");
		By password = By.id("password");
		By proceed  = By.name("proceed");
		
//		constructor
		public LoginClass(WebDriver driver) {
			this.driver = driver;
		}
		
		public WebElement username() {
			return driver.findElement(username);			
		}
		
		public WebElement password() {
			return driver.findElement(password);			
		}
		
		public WebElement proceed() {
			return driver.findElement(proceed);
		}
		
		public void Login() {
//			WebDriver driver = new ChromeDriver();
//			this.driver = driver;
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
//			driver.findElement(By.id("login1")).sendKeys("ram@gmail.com");
			username().sendKeys("ram@gmail.com");
			
//			driver.findElement(By.id("password")).sendKeys("pwd@1234");
			password().sendKeys("pwd@1234");
			
//			driver.findElement(By.name("proceed")).click();
			proceed().click();
		}
		
		public void ClearFields() {
//			Clear values for UN and PWD
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

			username().sendKeys("");
			password().sendKeys("");
		}
		
		public void getValues() {
//			Print the current valuesfor UN and PWD
			
		}
	
}
