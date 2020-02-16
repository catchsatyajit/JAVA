package com.satya.java.thread;

public class ThreadInterference {

	public static void main(String[] args) {
		
		final Shared s1 = new Shared();//creating immutable object
		
		Thread t1 = new Thread() {
			public void run() {
				s1.sharedMethod();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				s1.sharedMethod();
			}
		};
		t1.start();
		
		t2.start();
	}

}

class Shared {
	int i;

	public  void sharedMethod() {
		synchronized(this) {
			i = 10;
			System.out.println(i);
			i = 20;
			System.out.println(i);
			i = 30;
			System.out.println(i);
		}
		
	}
}