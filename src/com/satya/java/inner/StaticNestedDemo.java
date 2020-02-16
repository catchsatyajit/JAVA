package com.satya.java.inner;

public class StaticNestedDemo {

	public static void main(String[] args) {
		StaticNested.StaticClass sc = new StaticNested.StaticClass();
		sc.message();
	}

}

class StaticNested {
	private final static int data = 20;
	private final static int val = 29;

	static class StaticClass {
		public void message() {
			System.out.println(data + " " + val);
		}
	}
}