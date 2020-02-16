package com.satya.java.java8;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		JEC jec = new JEC();
		jec.hindi();
		jec.science();
		jec.advanceMath(12, 12);
		int val = jec.math(10, 12);
		System.out.println(val);
		Subject.showMassege("Satyajit Roy");
		Subject.showMassege("Mitali Roy");
	}

}

interface Subject {
	default void hindi() {
		System.out.println("Calling default HINDI method....");
	}

	default void science() {
		System.out.println("Calling default SCIENCE method....");
	}

	default void advanceMath(int x, int y) {
		System.out.println("Calling default ADVANCE MATH method...." + (x * y));
	}

	public int math(int x, int y);

	public static void showMassege(String name) {
		System.out.println("My name is :" + name);
	}
}

class JEC implements Subject {

	@Override
	public int math(int x, int y) {
		return (x * y);
	}

}