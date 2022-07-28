package com.cisco.prac;

public class MultipleExcep {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			System.out.println("Inside Try");
			a[5] = 5;
			a[3] = 2;
			a[1] = a[3]/0;
		}
		catch (ArithmeticException e) {
//			System.out.println(e.getMessage()));
			System.out.println("Inside Catch1");
		}
		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage()));
			System.out.println("Inside Catch2");
		}
		catch(Exception e) {
			System.out.println("Inside Catch3");
		}

	}

}
