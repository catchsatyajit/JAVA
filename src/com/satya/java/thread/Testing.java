package com.satya.java.thread;

public class Testing {

	public static void main(String[] args) {
		Bank b=new Bank(1000);
		new Thread() {
			public void run() {
				b.withdrawl(1500);
			}
		}.start();;
		new Thread() {
			public void run() {
				b.deposit(1500);
			}
		}.start();
		
	}

}

class Bank {
	int amount = 0;

	public Bank(int amount) {
		this.amount = amount;
	}

	public synchronized void withdrawl(int amount) {
		System.out.println("Amount trying to withdrawl :" + amount);
		if (this.amount < amount) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Available balance is :" + this.amount);
	}

	public synchronized void deposit(int amount) {
		System.out.println("Deposited amount is  :" + amount);
		this.amount = this.amount + amount;
		System.out.println("Available balance is :" + this.amount);
		notify();
	}
}

class Resource {
	public synchronized static void printTable(int n) throws InterruptedException {
		// synchronized (this) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * n);
			Thread.sleep(1000);
		}
		// }
	}
}

class Count implements Runnable {
	int i = 0;

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
		synchronized (this) {
			try {
				this.increament();
				System.out.println(
						Thread.currentThread().getName() + " Value for Thread After increment " + this.getValue());
				this.decreament();
				System.out.println(
						Thread.currentThread().getName() + " Value for Thread After decreament " + this.getValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}