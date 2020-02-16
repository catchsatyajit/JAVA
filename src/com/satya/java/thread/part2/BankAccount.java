package com.satya.java.thread.part2;

public class BankAccount {

	public static void main(String[] args) {
		Bank b = new Bank(1500);
		
		new Thread() {
			public void run() {
				try {
					b.withdrawl(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				b.deposit(2000);
			}
		}.start();

	}

}

class Bank {
	private int amount;

	public Bank(int amount) {
		this.amount = amount;
	}

	public synchronized void withdrawl(int amount) throws InterruptedException {
		System.out.println("Account having balance is        ::" + this.amount);
		System.out.println("Customer trying to withdrawal is ::" + amount);
		if (this.amount < amount) {
			wait();
		}
		this.amount = this.amount - amount;
		System.out.println("Remaining balance ::" + this.amount);
	}

	public synchronized void deposit(int amount) {
		System.out.println("Customer trying to deposit :" + amount);
		this.amount = this.amount + amount;
		System.out.println("Balance after deposit ::" + this.amount);
		notify();
	}

}