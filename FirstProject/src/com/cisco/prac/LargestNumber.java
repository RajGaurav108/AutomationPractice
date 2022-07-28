package com.cisco.prac;

public class LargestNumber {

	public static void main(String[] args) {
		
		int n1=1000,n2=108,n3=100;
		
		if (n1>n2) {
			if(n1>n3) {
				System.out.println("n1 is greater"); 
			}
			else {
				System.out.println("n3 is greater");
			}
		}
		else {
			if (n2>n3) {
				System.out.println("n2 is greater");
		    }
			else {
				System.out.println("n3 is greater");
			}
			
		}
	}

}
