package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ClassA {
	
//  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  
//  @Test(dataProvider = "logindata")
//  public void testLogin(String username,String password) {
//	  System.out.println(username+" "+password);
//  }
  
  @Test(enabled = true)
  public void TestA() {
	  System.out.println("Test A ClassA");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test
  public void TestB() {
	  System.out.println("Test B ClassA");
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test
  public void TestC() {
	  System.out.println("Test C ClassA");
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test
  public void TestD() {
	  System.out.println("Test D ClassA");
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("		beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("		afterMethod");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @DataProvider
  public String[][] logindata() {
      return new String[][] {
          new String[] {"un1","pw1"},
          new String[] {"un2","pw"},
          new String[] {"un3","pw"},
          new String[] {"un4","pw"},
      };
     
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("	beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("	afterClass");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
