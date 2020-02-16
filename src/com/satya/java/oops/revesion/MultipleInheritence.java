package com.satya.java.oops.revesion;

public class MultipleInheritence {

	public static void main(String[] args) {
		C c = new C();
		c.show();
	}

}

interface PT1 {
	default void show() {
		System.out.println("Default PI1");
	}

}

interface PT2 {
	default void show() {
		System.out.println("Default PI2");
	}

}

class C implements PT1, PT2 {
	public void show() {
		PT1.super.show();
		PT2.super.show();
	}

}