package com.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProj{

	public static void main(String[] args) throws InterruptedException {
		boolean flag= false;
		Statement statement = null;
		String query1;
		try { 		
    		String URL = "jdbc:mysql://localhost:3306/ecommerce";
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		Connection connection = DriverManager.getConnection(URL, "root", "");
    		
    		 statement = connection.createStatement();
 
    		
		} 
    	catch(SQLException e2) {
    		e2.printStackTrace();
    	} catch (ClassNotFoundException e) {
		}
        
		String [] arr_search = {
				"2020 apple macbook air",
				"apple iphone 12 pro max",
				"apple iphone 11 pro max"
		};
		int [] arr_id = {100,101,102};
		int prod_id=0;
		String prod_name=null;
		String search_item=null;
		String prod_price=null;
		String prod_mrp=null;
		String upd;

		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_95\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		for(int i=0;i<arr_search.length;i++) {
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arr_search[i]);
			driver.findElement(By.id("nav-search-submit-button")).click();
			List<WebElement> lstsearch =null;
			int cnt = 0;
			do {
			    lstsearch = driver.findElements(By.xpath("//div[contains(@data-cel-widget,'search_result_')]"));
			    System.out.println(lstsearch.size());
			    cnt++;
			    Thread.sleep(1000);
			} while (lstsearch.size()<=0 && cnt < 3);

		        for (cnt = 1; cnt < lstsearch.size(); cnt++) {
		        	
		        	String actual_name="";
		        	String actual_price="";
		        	String actual_mrp="";
		            WebElement item = lstsearch.get(cnt);
		            try {
		            	
						System.out.println(item.findElement(By.xpath(".//span[contains(text(),'Sponsored')]")).getText());
						continue;
						
					} catch (Exception e) {
						try {
			            	actual_name=item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText();
							//System.out.println(item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText());
							if(actual_name.toUpperCase().contains(arr_search[i].toUpperCase())) {
								flag=true;
							}
						} catch (Exception e1) {
							
							System.out.println("cannot find name of the product");
							
						}	   
					 try {
						    actual_price=item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText();
							//System.out.println(item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText());
						} catch (Exception e2) {
							System.out.println("cannot find price of the product");
						}   
			            try {
			            	actual_mrp=item.findElement(By.xpath(".//span[@class='a-price a-text-price']")).getText();
			            	String[] arr_mrp=actual_mrp.split("\\u20B9");
			            	if(arr_mrp.length>0) {
			            		actual_mrp=arr_mrp[1];
			            	}
							//System.out.println(item.findElement(By.xpath(".//span[@class='a-price a-text-price']")).getText());
						} catch (Exception e3) {
							System.out.println("cannot find mrp of the product");
						}
						
						 
					}
		            
		            if(flag) {
		            	
						String query="insert into products values('"+arr_id[i]+"','"+arr_search[i]+"','"+actual_name+"','"+actual_price+"','"+actual_mrp+"','')";	            
		            	try {
							 statement.executeUpdate(query);
							 
						} catch (SQLException e) {
						}
		            	
//		            	break;
		            	query1 = "select * from products";
		            	ResultSet rs = null;
						try {
							rs = statement.executeQuery(query1);
						} catch (SQLException e) {
						}
						
					
		            	try {
							while(rs.next()) {
							 prod_id = rs.getInt(1);
							 search_item=rs.getString(2);
							 prod_name=rs.getString(3);
							 prod_price=rs.getString(4);
						     prod_mrp=rs.getString(5);
//						  
							 
							//System.out.println(actual_name.getClass().getSimpleName());
//		            		
	            	}
							
		            	}
		            	
						 catch (SQLException e) {
							 System.out.println("inside catch");
						}
		            	
		            System.out.println(actual_name+"nme");
	            	System.out.println(actual_price+"prie");
	            	System.out.println(actual_mrp+"mrp");
	            	
	            	   System.out.println("id:"+prod_id);
					     System.out.println("name:"+prod_name);
					     System.out.println("search:"+search_item);
					     System.out.println("price:"+prod_price);
					     System.out.println("mrp:"+prod_mrp);
//					     if(prod_id==arr_id[i] && search_item == arr_search[i] && prod_name==actual_name && prod_price == actual_price && prod_mrp==actual_mrp) {
//					     
	            	
	            	
//					     && prod_name.contains(actual_name)&& prod_price.contains(actual_price)&& prod_mrp.contains(actual_mrp)
	            	
	            	
	            	if(prod_price.contains(actual_price)&& prod_id==arr_id[i]&& prod_mrp.contains(actual_mrp)&& search_item.contains(arr_search[i]) && prod_name.contains(actual_name)) {
	            		System.out.println("pass");
	            		 upd="UPDATE products SET passorfail = 'pass' WHERE prod_id ='"+prod_id+"' ";
	            		try {
							statement.executeUpdate(upd);
						} catch (SQLException e) {
						} 

	            
	            	}
	            	else {
	            		System.out.println("fail");
	            		upd="UPDATE products SET passorfail = 'fail' WHERE prod_id ='"+prod_id+"' ";
	            		try {
							statement.executeUpdate(upd);
						} catch (SQLException e) {
						}
	            		
	            		
	            	}
	            	
	            	break;
	            	

		}
		
	            
	            
	}
		
	
	}

}
}
