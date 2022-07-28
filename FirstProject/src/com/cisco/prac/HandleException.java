package com.cisco.prac;

public class HandleException {

	public static void main(String[] args) {
		int var = 0;
		try {
			int div = 10/var;
			System.out.println("Inside Try");
		}
		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("Inside Catch");
		}
		
//		System.out.println("Continue with this code");
        finally {
        	System.out.println("Inside finally");
        }
		System.out.println("After try catch code");
	}

}
