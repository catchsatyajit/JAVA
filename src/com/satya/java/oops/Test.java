package com.satya.java.oops;

public class Test {

	public static void main(String[] args) {
		Dogy d=new Dogy();
		d.sum(null);
	}
}
class Dogy{
	public void sum(int x) {
		System.out.println("integer :"+x);
	}
	public void sum(String x) {
		System.out.println("String :"+x);
	}
}
