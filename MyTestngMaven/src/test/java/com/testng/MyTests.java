package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class MyTests {
  @Test
  public void test() {
	  System.out.println("My Test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
  }
  
  @BeforeTest
  public void startReport() {
	
}

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test");
  }

}
