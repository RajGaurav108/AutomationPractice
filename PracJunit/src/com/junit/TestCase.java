package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("		setUpBeforeClass");

	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("		tearDownAfterClass");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("	setUp");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("    tearDown");
	}

	@Test
	public void testA() {
//		fail("Not yet implemented");
		System.out.println("Test A");
	}
	
	@Test
	public void testB() {
//		fail("Not yet implemented");
		System.out.println("Test B");

	}
	
	@Test
	public void testC() {
//		fail("Not yet implemented");
		System.out.println("Test C");

	}
	
	@Test
	public void testD() {
//		fail("Not yet implemented");
		System.out.println("Test D");

	}

}
