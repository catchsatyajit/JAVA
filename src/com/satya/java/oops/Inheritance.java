package com.satya.java.oops;

public class Inheritance {

	public static void main(String[] args) {
		Point p = new Point();
		// p.display();
		Cat c = new Cat();

		c.viewDetails();
		c.viewAll();
		
		Ink.viewStaticData();
	}

}

class Dog {
	public Dog() {
		System.out.println("Dog connstructor");
	}

	public void viewDetails() {
		System.out.println("**** Dog Details*****");
	}

	public void viewAll() {
		System.out.println("**** View All*****");
	}
}

class Cow {
	private static int data = 20;

	public static void viewStaticData() {
		System.out.println("The value is :" + data);
	}
}
class Ink extends Cow{
	
}

class Cat extends Dog {
	public Cat() {

		System.out.println("Cat connstructor");
	}

	@Override
	public void viewDetails() {
		// super.viewDetails();
		System.out.println("**** Cat Details*****");
	}

}

interface PointC {
	default void display() {
		System.out.println(" PointC display");
	}
}

interface PointD {
	default void display() {
		System.out.println(" PointD display");
	}
}

class Point implements PointC, PointD {
	@Override
	public void display() {
		PointC.super.display();
		PointD.super.display();
	}

}