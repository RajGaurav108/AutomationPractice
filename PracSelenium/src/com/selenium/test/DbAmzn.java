package com.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbAmzn {
	public static void main(String[] args) throws InterruptedException, SQLException {


		Statement statement = null;
		boolean flag = false;
		String query;
		String prod_mrp;
		String prod_name;
		int prod_id;
		String searchText;
		String prod_price;
		String upd;
		String[] arr_search = {
				"2020 apple macbook pro",
				"apple iphone 12 pro max", 
				"Apple watch series 6" 		
		};
		
		
		int[] arr_id = {123,124,125}; 

		try {
			String URL = "jdbc:mysql://localhost:3306/ecommerce";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, "root", "");
			statement = connection.createStatement();
//			String add_column;

			//			add_column="ALTER TABLE products ADD passOrfail varchar(20) ";
			//			statement.executeUpdate(add_column);
		}
		catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		for (int i = 0; i < arr_search.length; i++) 
		{


			driver.get("http://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arr_search[i]);
			driver.findElement(By.id("nav-search-submit-button")).click();
			List<WebElement> lstSearch = null;
			int cnt = 0;
			do {

				lstSearch = driver.findElements(By.xpath("//div[contains(@data-component-type,'s-search-result')]"));

				System.out.println(lstSearch.size());
				cnt++;
				Thread.sleep(1000);

			} 
			while (lstSearch.size() <= 0 && cnt < 3);
			
			System.out.println("Size outside loop\n");
			
			System.out.println(lstSearch.size());
			
			
			for (cnt = 0; cnt < lstSearch.size(); cnt++) {
				String actual_name = "";
				String actual_price = "";
				String actual_mrp = "";

				WebElement item = lstSearch.get(cnt);

				try 
				{
					System.out.println(
							item.findElement(By.xpath(".//span[contains(text(),'Sponsored')]")).getText() + "\n");
					continue;
				}
				catch (Exception e1)
				{
					System.out.println(
							item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText());
					actual_name = item.findElement(By.xpath(".//a[@class='a-link-normal a-text-normal']")).getText();
					if (actual_name.toUpperCase().contains(arr_search[i].toUpperCase())) {
						flag = true;
						}

					try 
					{

						actual_price = item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText();

						System.out.println(item.findElement(By.xpath(".//*[@class='a-price-whole']")).getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("product unavailable \t");
					}

					try 
					{
						actual_mrp = item.findElement(By.xpath(".//span[@class='a-price a-text-price']/span[2]")).getText();
						String[] arr_mrp = actual_mrp.split("\\u20B9");
						if (arr_mrp.length > 0)
						{
							actual_mrp = arr_mrp[1];

						}
						System.out.println(	item.findElement(By.xpath(".//span[@class='a-price a-text-price']/span[2]")).getText());
					} 
					
					catch (Exception e)
					{
						actual_mrp="no discount";

						System.out.println(actual_mrp);
					}
					//					
					if (flag) {
						
						query = "INSERT INTO products " + "VALUES('"+arr_id[i]+"','" + arr_search[i] + "','" + actual_name+ "','" + actual_price + "','" + actual_mrp + "','')";

						try
						{
							statement.executeUpdate(query);
						} 
						catch (SQLException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						query = "select * from products";
						ResultSet rs =statement.executeQuery(query);
						

						while (rs.next()) 
						{
							prod_id = rs.getInt(1);
							 searchText = rs.getString(2);
							prod_name = rs.getString(3);
							 prod_price = rs.getString(4);
							 prod_mrp = rs.getString(5);
//								System.out.println("sql id : "+prod_id);						
//								System.out.println("this is searchtext : "+searchText.toLowerCase());
//								System.out.println("this is actual name from sql :  "+prod_name.toLowerCase());
//								System.out.println("sql price  "+prod_price);
								System.out.println(prod_id == arr_id[i]);
								System.out.println(prod_name.toLowerCase().contains(searchText.toLowerCase()));
//								System.out.println(prod_price == actual_price);
//								System.out.println("sql price  "+prod_price);
//								System.out.println("actual price  "+actual_price);
								System.out.println(rs.next());		

//								System.out.println(prod_mrp == actual_mrp);
							if ( prod_id == arr_id[i] && prod_name.toLowerCase().contains(searchText.toLowerCase()) )
							{


								upd="UPDATE products SET passOrfail = 'pass'  WHERE prod_id ='"+prod_id+"' "; 
								statement.executeUpdate(upd);
								System.out.println("pass");	
								break;
							}
							else
							{

								upd="UPDATE products SET passOrfail = 'fail'  WHERE prod_id ='"+prod_id+"' "; 
								statement.executeUpdate(upd);
							}
									System.out.println(rs.next());		
						}//while



						System.out.println("the actual naame issss \n"+actual_name);
						System.out.println(actual_price);
						System.out.println(actual_mrp);
											break;
					}//if flag
					}//catch block if not sponsored
			
			}//inner for
			}//outer for
		}//main
}//class
