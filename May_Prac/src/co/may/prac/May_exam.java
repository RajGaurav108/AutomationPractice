package co.may.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May_exam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cafy3.cisco.com/");
		driver.findElement(By.className("bp3-button-text")).click();
		driver.findElement(By.className("testbed-header-text")).click();
		
		
	}

}
