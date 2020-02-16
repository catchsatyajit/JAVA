package com.satya.java.thread;

public class Account {

	public static void main(String[] args) {
		Balance b = new Balance(1000);
		new Thread() {
			public void run() {
				b.withdrawal(1500);
			}
		}.start();
		new Thread() {
			public void run() {
				b.deposit(2000);
			}
		}.start();

	}

}

class Balance {
	int amount = 0;

	public Balance(int amount) {
		this.amount = amount;
	}

	public synchronized void withdrawal(int amount) {
		System.out.println("The amount tring to withdrawl is: " + amount);
		if (this.amount < amount) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Abailable balance is: " + this.amount);
	}

	public synchronized void deposit(int amount) {
		System.out.println("Deposited amount is: " + amount);
		this.amount = this.amount + amount;
		System.out.println("Total Available balance is: " + this.amount);
		notify();
	}
}