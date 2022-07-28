package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmznDbConn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
        int[] arr_id = {101,102,103};
		String[] arr_search = {
				"2020 apple macbook air",        
				"apple iphone 12 pro max",
				"Apple watch series 6"
		};
		for (int i = 0; i < arr_search.length; i++) {
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arr_search);
		    driver.findElement(By.id("nav-search-submit-button")).click();
		    break;
		}
		List<WebElement> lstsearch = null;
		int cnt = 0;
		do {
			lstsearch = driver.findElements(By.xpath("//div[contains(@data-cel-widget,'search_result_')]"));
            System.out.println("Before/After Loading lstSearch Size :"+lstsearch.size());
            cnt++;
            System.out.println("After "+cnt+" time Do-While Iterated?\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		} while (lstsearch.size()<=0 && cnt < 3);
		
		
        System.out.println("Size outside loop :"+lstsearch.size()+"\n");
		
		boolean flag = false;
		for (cnt = 0; cnt < lstsearch.size(); cnt++) {
        	System.out.println("\nFor Count "+cnt); 
			String actual_name = "";
			String actual_price = "";
			String actual_mrp = "";
			WebElement item = lstsearch.get(cnt);
			
          List<WebElement> lstSP = item.findElements(By.id("ad-feedback-text-auto-sparkle-hsa-tetris"));
//			List<WebElement> lstSP = item.findElements(By.xpath(".//span[contains(text(),'Sponsered')]"));
			if(lstSP.size()>0) {
				System.out.println("Checking Sponsered Items...");
				System.out.println("This is Sponsered Items（￣︶￣）↗　\n");
				continue;
			}
			
			try {
				System.out.println(item.findElement(By.xpath(".//span[contains(text(),'Sponsered')]")).getText());
				continue;
			} catch (Exception e1) {
				System.out.println("Not a Sponserd Item");
			}
			
			try {
				actual_name = item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText();
				System.out.println(item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText());
//				if (actual_name.toUpperCase().contains(arr_search.toUpperCase())) {
//					flag = true;
//				}
			} catch (Exception e) {
				System.out.println("Can't find the name of the product\n");
				continue;
			}
			
			try {
				actual_price = item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText();
				System.out.println(item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText());
			} catch (Exception e) {
				System.out.println("Cant find the offer on product");
			}
			
			try {
				actual_mrp = item.findElement(By.xpath(".//span[@class='a-price a-text-price']/span[2]")).getText();
				String[] arr_mrp = actual_mrp.split("\\u2089");
				if(arr_mrp.length > 0) {
					actual_mrp = arr_mrp[1];
				}
				
				System.out.println(item.findElement(By.xpath(".//span[@class='a-price a-text-price']/span[2]")).getText());
			} catch (Exception e) {
				System.out.println("Can't find MRP of the product\n");
			}
			
			if(flag) {
				System.out.println("**Searched Item**");
				System.out.println("actual_name  :"+actual_name);
				System.out.println("actual_price :"+actual_price);
				System.out.println("actual_mrp   :"+actual_mrp);
				break;
			}
		}


	}

}
