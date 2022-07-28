package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAmzn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("2020 apple macbook pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> lstSearch = null;
        int cnt = 0;
        do {
        
            lstSearch = driver.findElements(By.xpath("//div[contains(@data-cel-widget,'search_result_')]"));
            System.out.println("Before/After Loading lstSearch Size :"+lstSearch.size());
            cnt++;
            System.out.println("After "+cnt+" time Do-While Iterated?\n");
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
        } while (lstSearch.size()<=0 && cnt < 3);
        
        System.out.println("Size outside loop :"+lstSearch.size()+"\n");
        
        for (cnt = 0; cnt < lstSearch.size(); cnt++) {
        	System.out.println("\nFor Count "+cnt); 
            WebElement item = lstSearch.get(cnt);
            
//			List<WebElement> lstSP = item.findElements(By.xpath(".//span[contains(text(),'Sponsered')]"));
            List<WebElement> lstSP = item.findElements(By.id("ad-feedback-text-auto-sparkle-hsa-tetris"));
			
            //We take if cond here bec, if lstSP size will be greater than 0,then sure it is sponsered item.if yes then continue
            if(lstSP.size()>0) {
				System.out.println("Checking Sponsered Items...");
				System.out.println("This is Sponsered Items\n");
				continue;
			}
            
            try {
//            	System.out.println(item.findElement(By.id("ad-feedback-text-auto-sparkle-hsa-tetris")).getText());
				System.out.println(item.findElement(By.xpath(".//span[contains(text(),'Sponsered')]")).getText());
				continue;
			} catch (Exception e1) {
				System.out.println("Not a Sponserd Item");
			}
            
            try {
				System.out.println(item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText());
			} catch (Exception e) {
				System.out.println("Can't find the name of the product\n");
				continue;
			}

            try {
				System.out.println(item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText());
			} catch (Exception e) {
				System.out.println("Can't find the offer price of the product");
				
			}
            
            try {
				System.out.println(item.findElement(By.xpath(".//span[@class='a-price a-text-price']")).getText());
//				System.out.println(item.findElement(By.xpath(".//span[@class='a-price a-text-price']/span[2]")).getText());

			} catch (Exception e) {
				System.out.println("Can't find MRP of the product\n");
			}
        }
        
		
	}

}
