package com.cisco.prac;

public class CallMobile {

	public static void main(String[] args) {
		Mobile iphone = new Mobile("iphone","green");
		
		int contnum = 887977723;
		iphone.dialNumber(contnum);
		
		iphone.turnOn();
		
		int incoming = 796262226;
		iphone.answerNumber(incoming);
		
		contnum = 887945623;
		iphone.dialNumber(contnum);
		
		int contnum2=99652485;
		iphone.dialNumber(contnum2);
		

	}

}
