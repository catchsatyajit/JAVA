package com.satya.java.oops.revesion;

public class Test {

	public static void main(String[] args) {
		SingletonExample se=SingletonExample.getSingletonObject();
		se.displayResult();
	}
}

class SingletonExample {
	private static SingletonExample singleton = new SingletonExample();

	public SingletonExample() {

	}

	public static SingletonExample getSingletonObject() {
		return singleton;
	}

	public void displayResult() {
		System.out.println("Hello singleton!!");
	}
}