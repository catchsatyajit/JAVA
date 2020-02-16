package com.satya.java.oops.revesion;

public class MethodOverloading {

	public static void main(String[] args) {
		CalculateValue c = new CalculateValue();
		System.out.println(c.add(10, 12));
		System.out.println(c.add(12, 12, 12));
		System.out.println(c.add("Satyajit ", "Roy"));
		B b = new B();
		b.printMessage();

	}

}

class CalculateValue {
	public int add(int x, int y) {
		return (x + y);
	}

	public String add(String x, String y) {
		return (x + y);
	}

	public int add(int x, int y, int z) {
		return (x + y + z);
	}

}

class A {
	public void printMessage() {
		System.out.println("Super class");
	}
}

class B extends A {
	public void printMessage() {
		System.out.println("Sub class");
	}
}