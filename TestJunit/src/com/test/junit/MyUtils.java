package com.test.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
class MyUtils {
	public static int add(int x, int y) {
		return x  -y;
	}

	@Test
	void TestDynamicTest() {
		int x = 5;
		int y = 12;

		//		DynamicTest dynamicTest = 
		dynamicTest("Test for MyUtils.add("+x+","+y+")", ()->{
			inputVariables(x+y,add(x, y));
		}
				);

	}
	private void inputVariables(int i, int add) {
		System.out.println("Input Vari");
		assertEquals(add, i);

	}
	//		dynamicTest("Dynamic Test", () -> assertTrue(true));
}
