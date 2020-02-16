package com.satya.java.oops;

public class InstanceInitializerBlock {

	public static void main(String[] args) {
		Car c1 = new Car();
	}

}

class Bike {
	int speed = 30;

	Bike() {
		System.out.println("Speed of the bike is :" + speed);
	}

}

class Car extends Bike {
	int data;

	Car() {
		super();
		System.out.println("Speed of the car is :" + data);
	}

	{
		data = 40;
	}
}