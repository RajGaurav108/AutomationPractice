package com.listeners;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class listeners {
	WebDriver driver;
	@Test
	public void open_swiggy_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}

	@Test(dependsOnMethods ="locate me" )
	public void user_click_locate_me() {
		//Locate me
		driver.findElement(By.className("LukWG")).click();

	}

	@Test (dependsOnMethods ="click on search button" )
	public void user_clicks_search_button() {
		//Search
		driver.findElement(By.xpath("//a/span[text()='Search']")).click();
	}

	@Test (dependsOnMethods ="enter the item name as pizza" )
	public void user_enter_name_pizza() {
		//Enter item name
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("PIZZA");
	}
	@Test (dependsOnMethods ="click on the item" )
	public void user_clicks_on_the_item() {
		//click on item
		driver.findElement(By.xpath("//i[@class='icon-magnifier _1F77L']")).click();
	}
	@Test (dependsOnMethods ="selecting diffrent options of pizza" )
	public void user_selecting_different_pizzas() {
		//selecting options
		driver.findElement(By.xpath("//div/span/span[text()='Sweet Corns ']")).click();
	}
	@Test (dependsOnMethods ="click on image" )
	public void user_click_on_image() {
		//click on image
		driver.findElement(By.xpath("//div/button[@aria-label='See more information about Sweet Corns Pizza']")).click();

	}
	@Test (dependsOnMethods ="user adds pizza to cart" )
	public void user_add_to_cart() {
		//add to cart
		driver.findElement(By.xpath("//div/div[@class='F8dpS styles_addBtnDwebReset__2Q6BN _3L1X9']")).click();
	}
	@Test (dependsOnMethods ="user opening cart" )
	public void user_opening_cart() {
		//opening cart
		driver.findElement(By.xpath("//div/div/a[@class='_1T-E4']")).click();
	}



}
