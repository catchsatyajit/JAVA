package com.satya.java.thread;

public class RaceCondition {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		Thread t3 = new Thread(counter);

		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
	}

}

class Counter implements Runnable {
	private int c = 0;

	public void increament() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c++;
	}

	public void decreament() {
		c--;
	}

	public int getValue() {
		return c;
	}

	@Override
	public void run() {
		// making the block synchronized so that only one thread can access the shared resource at a time
		synchronized (this) {
			this.increament();
			System.out.println("Value for Thread After increment " + this.getValue());
			this.decreament();
			System.out.println("Value for Thread After decreament " + this.getValue());
		}

	}

}