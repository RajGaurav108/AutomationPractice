package com.junit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir")+"/resources/environment.properties");
        Properties properties = new Properties();
        try {
			properties.load(new FileInputStream(System.getProperty("user.dir")+"/resources/environment.properties"));
			System.out.println(properties.getProperty("test"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
