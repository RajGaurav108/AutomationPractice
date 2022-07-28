package com.rediff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Tests {
  @Test
  public void test() {
	  System.out.println("My Test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test");
  }

}
