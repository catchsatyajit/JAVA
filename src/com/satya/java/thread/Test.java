package com.satya.java.thread;

public class Test {

	public static void main(String[] args) {
		Counting c=new Counting();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}

}

class Counting implements Runnable {
	int i=0;
	public void increament() throws InterruptedException {
		i++;
		Thread.sleep(1000);
	}
	public void decreament() {
		i--;
	}
	public int getValue() {
		return i;
	}
	@Override
	public void run() {
		try {
			synchronized (this) {
				this.increament();
				System.out.println("The value of i after increament is  :"+i);
				this.decreament();
				System.out.println("The value of i after decreamnt is   :"+i);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

