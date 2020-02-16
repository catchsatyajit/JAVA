package com.satya.java.thread;

public class ThreadTesting {

	public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.setName("First Thread");
		Tree t2 = new Tree();
		t2.setName("Second Thread");
		Tree t3 = new Tree();
		t3.setName("Third Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
	//	t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		
	}

}

class Tree extends Thread {
	public void run() {
		System.out.println("Running thread name     :"+Thread.currentThread().getName());
		System.out.println("Running thread priority :"+Thread.currentThread().getPriority());
	}
}

class Pilot implements Runnable {

	@Override
	public void run() {
		System.out.println("Pilot implements Runnable interface to create a thread.....");

	}

}

class Doctor implements Runnable {

	@Override
	public void run() {
		System.out.println("Doctor implements Runnable interface to create a thread.....");

	}

}