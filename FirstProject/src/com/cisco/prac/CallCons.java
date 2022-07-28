package com.cisco.prac;

public class CallCons {

	public static void main(String[] args) {
		Car ferrari = new Car("ferrari","red");
		
		ferrari.printmodel();
		System.out.println(ferrari.gear);
		System.out.println(ferrari.state);
		System.out.println(ferrari.speed);
		
		ferrari.startCar();
		System.out.println(ferrari.state);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.gearUp();
		System.out.println(ferrari.gear);
		
		ferrari.speedUp();
		System.out.println(ferrari.speed);
		

	}

}
