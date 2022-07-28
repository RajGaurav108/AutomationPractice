package com.tdd;

public class LibMath {

	public String Add(int op1, int op2) {
		if (op1 > 100) {
			return "Op1 greater than 100";
		}
		int sum = op1 + op2;
		return Integer.toString(sum);
		
	}
}
