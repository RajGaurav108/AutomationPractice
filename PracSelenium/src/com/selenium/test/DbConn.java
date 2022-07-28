package com.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Date=05-oct-2021
public class DbConn {
	public static void main(String[] args) {
		
		int[] arr_id = {101,102,103};
		
		String[] arr_search = {
				"2020 apple macbook air",        
				"apple iphone 12 pro max",
				"Apple watch series 6"
		};
				
		String URL = "jdbc:mysql://localhost:3306/ecommerce";
//		String URL = "jdbc:mysql://localhost:3306/db_cisco";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection connection = DriverManager.getConnection(URL, "root", "");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
			System.out.println("Connected to MySql DB");
			Statement statement = connection.createStatement();
			String query = "";
			for (int cnt = 0; cnt < arr_id.length; cnt++) {
				query = "insert into products values("+arr_id[cnt]+",'"+arr_search[cnt]+"','','','')";
			int executeUpdate = statement.executeUpdate(query);	
			System.out.println("Added into table => products");
//			ResultSet resultSet = statement.executeQuery(query);
//			ResultSet resultSet = statement.executeQuery("select* from user");
			}
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
//			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	    }    
    }
}
