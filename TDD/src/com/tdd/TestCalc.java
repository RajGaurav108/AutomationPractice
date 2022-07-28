package com.tdd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
	//	1.Write the failing tests
	//	2.Code to pass the tests
	//	3.Refactor the code to make them pass

	LibMath libMath = new LibMath();

	@Test
	public void TestOp1Greater() {
		String actValue = libMath.Add(101, 0);
		Assert.assertEquals(actValue, "Op1 greater than 100");
	}

	@Test
	public void TestOp2Greater() {
		String actValue = libMath.Add(0, 101);
		Assert.assertEquals(actValue, "Op2 greater than 100");
	}

	@Test
	public void TestOp1Less() {
		String actValue = libMath.Add(-1, 10);
		Assert.assertEquals(actValue, "Op1 less than 0");
	}

}
