package com.satya.java.thread;

public class PriorityDemo {

	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.getPriority());
		t.setPriority(3);
		System.out.println(t.getPriority());
	}

}
