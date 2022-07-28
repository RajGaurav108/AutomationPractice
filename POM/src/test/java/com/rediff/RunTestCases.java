package com.rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTestCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_96\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        LoginClass login = new LoginClass(driver);
        login.Login();
        
        Thread.sleep(2000);
        
        login.ClearFields();
        
        
        
	}

}
