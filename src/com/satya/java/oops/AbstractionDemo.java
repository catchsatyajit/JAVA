package com.satya.java.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposite();
		sbi.withdrawl();
		sbi.interest(10, 10);
		
	}

}

class SBI extends AbstractBank {
	public void interest(int x, int y) {
		System.out.println(x * y * 10);
	}
}

abstract class AbstractBank implements BankInterface {
	void deposite() {
		System.out.println("deposite");
	}

	void withdrawl() {
		System.out.println("withdrawl");
	}

	void loan(int x, int y) {
		System.out.println(x + y);
	}
}

interface BankInterface {
	 abstract void interest(int x, int y);

}
