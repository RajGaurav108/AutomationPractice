package com.selenium.test;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File tmp = new File("C:\\EclipseSS\\ss1.jpg");
		System.out.println("Done");
		try {
			System.out.println(tmp.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
