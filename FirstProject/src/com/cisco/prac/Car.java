package com.cisco.prac;

public class Car {

	int gear;
	boolean state;
	int speed;
	int maxGear = 5;

	String color;
	String model;

//	public Car() {
//		System.out.println("Zero Args Construct");
//		state = false;
//		speed = 0;
//		gear = 0;
//
//	}

	public Car(String model, String color) {
		System.out.println(model);
		model = "Altroz";
		this.model = model;

	}
	public void printmodel() {
		System.out.println(model);

	}

	public void startCar() {
		state = true;
	}

	public void stopCar() {
		state = false;
	}
	public void gearUp() {
		if (gear<5) {
			gear = gear + 1;
		}
		else {
			System.out.println("Reached Max Gear");
		}

	}
	
	public void speedUp() {
		speed = speed + 10;
	}

}
