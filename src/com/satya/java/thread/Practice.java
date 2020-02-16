package com.satya.java.thread;

public class Practice {

	public static void main(String[] args) {
		Race r=new Race();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
	}

}

class Race implements Runnable {
	int i = 0;

	public void increament() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void decreament() {
		i--;
	}

	public int getValue() {
		return i;
	}

	@Override
	public synchronized void run() {
		//synchronized (this) {
			this.increament();
			System.out.println(this.getValue());
			this.decreament();
			System.err.println(this.getValue());
		//}
	}

}