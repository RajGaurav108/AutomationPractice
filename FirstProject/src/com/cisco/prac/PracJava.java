package com.cisco.prac;

public class PracJava {
	public static void main(String[] args) {

		int op1,op2,sum;
		op1=10;
		op2=30;

		sum = op1 + op2;
		System.out.println("Sum of "+op1+" and "+op2+" is "+sum);
		
		
		if (sum>50) {
			System.out.println("Sum>50");
		}
		else {
			System.out.println("Sum<=50");
		}
		System.out.println("End");

	}


}