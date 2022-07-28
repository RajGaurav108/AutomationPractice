package com.test.junit;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

//import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Disabled
	@Test
	void asertTruePass() {
		System.out.println("Test Pass");
		assertTrue(3 > 2);
	}
	
	@Disabled
	@Test 
	void asertTrueFail() {
		System.out.println("Test Fail");
		assertTrue(3 < 2);
		
	}

	@RepeatedTest(2)
//	@Test
	void TestAssume() {
		int i = -3;
//		assumeTrue(i > 0);
		System.out.println(3/i);
		System.out.println("Value of i "+i);
	}
	
	void TestDynamicTest() {
		
//		dynamicTest("Dynamic Test",()-> assertTrue(true));
	}

}
