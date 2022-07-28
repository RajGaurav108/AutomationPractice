package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeEach");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");
		System.out.println("My Fav topic Is Extent Report");
	}

	@Test
	void Test1() {
		System.out.println("Test1");
	}
	@Test
	void Test2() {
		System.out.println("Test2");
	}

}
