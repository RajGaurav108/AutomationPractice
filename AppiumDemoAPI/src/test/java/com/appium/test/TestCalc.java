package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class TestCalc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities Capabilities = new DesiredCapabilities();
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "11");
		Capabilities.setCapability("deviceName", "Android Emulator");
		Capabilities.setCapability("appPackage", "com.google.android.calculator");
		Capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		Capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub") ;

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, Capabilities);
		System.out.println(driver.getSessionId());


//		try {
//			for (int i = 0; i < 3; i++) {
//				Thread.sleep(5000);
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Thread.sleep(5000);

		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		Thread.sleep(5000);

	}
}	
