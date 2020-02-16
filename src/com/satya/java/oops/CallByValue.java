package com.satya.java.oops;

public class CallByValue {
	public static void main(String[] args) {
		Operation o=new Operation();
		System.out.println(o.data);
		o.value(100);
		System.out.println(o.data);
	}

}

class Operation {
	int data = 50;

	public void value(int data) {
		data = data + 100;
	}
}