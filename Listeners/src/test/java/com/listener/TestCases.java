package com.listener;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class TestCases {
	@Test
	public void testLoginPass() {
		System.out.println("Executing a LoginPass");
	}
	
	@Test
	public void testLoginFail() {
		System.out.println("Executing a LoginFail");
		assertEquals(false, true);
	}
	
	@Test(dependsOnMethods = "testLoginFail")
	public void testLoginSkip() {
		System.out.println("Executing a LoginSkip");
	}
	
	@Test(dependsOnMethods = "testLoginPass")
	public void testLoginDependent() {
		System.out.println("Executing a testLoginDependent");
	}

}
