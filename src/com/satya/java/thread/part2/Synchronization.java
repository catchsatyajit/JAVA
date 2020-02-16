package com.satya.java.thread.part2;

public class Synchronization {
	

	public static void main(String[] args) {
		PanCard p = new PanCard();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		t1.start();
		t2.start();
		t3.start();
	}

}

class PanCard implements Runnable {
	private int ctr = 0;

	public void increament() throws InterruptedException {
		ctr++;
		Thread.sleep(1000);
	}

	public void decreament() throws InterruptedException {
		ctr--;
		Thread.sleep(1000);
	}

	public int getValue() {
		return ctr;
	}

	public void run() {
		synchronized (this) {
			try {
				this.increament();
				System.out.println("Value after increament by :" + Thread.currentThread().getName() + "-" + this.getValue());
				this.decreament();
				System.out.println("Value after decreament by :" + Thread.currentThread().getName() + "-" + this.getValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}