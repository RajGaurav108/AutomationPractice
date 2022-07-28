package com.cisco.prac;

public class CheckElecBill {

	public static void main(String[] args) {
		int units = 380;
		int bill = 0;
		if (units<=0) {
			System.out.println("Units <= 0");
		}
		else if (units <=100) {
			bill = units;
			System.out.println("Bill amount is "+bill);
		}
		else if (units <=200) {
			bill = 100 + (units-100)*2;
			System.out.println("Bill amount is "+bill);
		}
		else if (units <=300) {
			bill = 300 + (units-200)*3;
			System.out.println("Bill amount is "+bill);
		}
		else if (units <=400) {
			bill = 600 + (units-300)*4;
			System.out.println("Bill amount is "+bill);
		}
		else  {
			bill = 1000 + (units-400)*5;
			System.out.println("Bill amount is "+bill);
		}

	}

}
