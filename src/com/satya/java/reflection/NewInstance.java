package com.satya.java.reflection;

public class NewInstance {

	public static void main(String[] args) {
		try {
			Class<?> c=Class.forName("com.satya.java.reflection.NewInstance");
			System.out.println(c.getName());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class Sample {
	void message() {
		System.out.println("Hello Java");
	}
}