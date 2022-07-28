package com.cisco.prac;

public class TypeCasting {

	public static void main(String[] args) {
		
		int num = 10/3;
		double dnum = 5.5;
		System.out.println("Initially..");
		System.out.println(num);
		System.out.println(dnum);
		
		System.out.println("Casting..");
		num = (int) dnum;
		
		System.out.println(num);
		dnum = num;
		System.out.println(dnum);
		

	}

}