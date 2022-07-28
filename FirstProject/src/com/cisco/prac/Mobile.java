package com.cisco.prac;

public class Mobile {

	boolean state;
	String name;
	String model;
	String color;
	boolean dial;
	boolean answer;

	public Mobile() {
		System.out.println("Zero Args Construct");
		this.state = true;
//		boolean answer = false;
		this.answer = false;
	}
	public Mobile(String model,String color) {
		this.state = false;
		this.dial = false;
		this.answer =false;

		System.out.println(model);
		this.model = model;
		System.out.println(color);
		this.color = color;
	}
	public void printModel() {
		System.out.println(model);
	}
	public void turnOn() {
		this.state=true;
	}
	public void dialNumber(int contnum) {
//		if (this.checkCondition()) {
		if (checkCondition()) {
			System.out.println("Dialed! on call now with "+contnum);
			this.dial=true;
		}
		//		if (this.dial==false && this.answer==false && this.state==true) {
		//			System.out.println("Dialed! on call now with "+contnum);
		//			
		//		}
		//		else if(this.state==false) {
		//			System.out.println("Mobile is OFF");
		//		}
		//		else if(this.dial==true) {
		//			System.out.println("Already dialed a number");
		//		}
		//		else if(this.answer==true) {
		//			System.out.println("Already answered a call");
		//		}

		//		this.dial = true;

	}
	public void answerNumber(int contnum) {
		if (checkCondition()) {
			System.out.println("Answered! on call now with "+contnum);
			this.answer=true;
		}

	}
	public boolean checkCondition() {
		if(this.state==false) {
			System.out.println("Mobile is OFF");
			return false;
		}	

		else if(this.dial==true) {
			System.out.println("Already dialed a number");
			return false;
		}
		else if(this.answer==true) {
			System.out.println("Already answered a call");
			return false;
		}

		return true;

	}
}


