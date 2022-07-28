package com.selenium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Utils;


public class TestGrid extends Utils {


static WebDriver driver;
public static void main(String[] args) throws MalformedURLException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
URL url = new URL("http://localhost:4444/wd/hub");

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setBrowserName("chrome");
// capabilities.setPlatform(Platform.WIN10);
// driver = new ChromeDriver();

driver = new RemoteWebDriver(url, capabilities);

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
// List<WebElement> lstLinks = driver.findElements(By.tagName("a"));
// System.out.println(lstLinks.size());
// for(int i=0;i<lstLinks.size();i++) {
// System.out.println(lstLinks.get(i).getText());
// }
saveScreenShot("TestGrid", driver);
driver.findElement(By.id("login1")).sendKeys("raj@cisco.com");
driver.findElement(By.id("password")).sendKeys("pwd123");
saveScreenShot("UserDetails", driver);

driver.findElement(By.name("proceed")).click();
saveScreenShot("PostLogin", driver);
WebElement CheckBox = driver.findElement(By.id("remember"));
if(CheckBox.isSelected()) {
CheckBox.click();
}
saveScreenShot("Checkbox Selection", driver);

}

}