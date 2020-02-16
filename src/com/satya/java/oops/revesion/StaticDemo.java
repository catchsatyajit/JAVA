package com.satya.java.oops.revesion;

public class StaticDemo {
	static final int x;
	static {
		x = 10;
		System.out.println("**** Static block execution *****" + x);
	}

	public static void main(String[] args) {
		new Ball();
		new Ball();
		new Ball();
		new Ball();
	}

}

class Ball {
	public static int data = 0;

	Ball() {
		data++;
		System.out.println("Value is ::" + data);
	}
}