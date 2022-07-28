package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathLib {

	LibMath lib = new LibMath();

	@Test
	public void testAdd() {
		int op1 = 10;
		int op2 = 20;
		int expSum = 30;
		int actSum = lib.add(op1,op2);
		
//		if (expSum==actSum) {
//			System.out.println("Add method is working as expected");
//		}
		
		Assert.assertEquals(actSum, expSum);
		
	}

	@Test
	public void testSub() {
		int op1 = 10;
		int op2 = 20;
		int expDiff = 30;
		int actDiff= lib.sub(op1,op2);
		
		Assert.assertEquals(actDiff, expDiff);
		
	}
}
