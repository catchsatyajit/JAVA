package com.satya.java.thread;

public class Customer {
	int amount;

	public Customer(int amount) {
		super();
		this.amount = amount;
	}

	public synchronized void withdrawl(int amount) {
		System.out.println("Checking balance with withdrawl " + amount);
		if (this.amount < amount) {
			System.out.println("Current balance is " + this.amount+ " which is less thwn withdrawl amount waiting for deposite....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Amount " + amount + " has been withdrawl from your acount now available balance is" + this.amount);
	}

	public synchronized void deposit(int amount) {
		System.out.println("depositing amount is " + amount);
		this.amount = this.amount + amount;
		System.out.println("Amount " + amount + " has been deposited to your acount available balance is" + this.amount);
		notify();
	}

	public static void main(String[] args) {
		Customer c = new Customer(1000);
		new Thread() {
			public void run() {
				c.withdrawl(1500);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(1000);
			}
		}.start();

	}

}
