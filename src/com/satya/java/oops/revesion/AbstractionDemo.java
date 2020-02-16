package com.satya.java.oops.revesion;

public class AbstractionDemo {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposit("SBI");
		sbi.withdrawl("SBI");
		sbi.interest(10, 12,"SBI");
		UBI ubi=new UBI();
		ubi.deposit("UBI");
		ubi.withdrawl("UBI");
		ubi.interest(12, 12,"UBI");
	}

}

class UBI extends AbstractBank {
	@Override
	public void interest(int x, int y,String name) {
		System.out.println(name+" Interest is ::" + (x * y * 10));
	}
}

class SBI extends AbstractBank {

	@Override
	public void interest(int x, int y,String name) {
		System.out.println(name+" Interest is ::" + (x * y * 100));
	}
}

abstract class AbstractBank implements BankInterface {

	@Override
	public void deposit(String name) {
		System.out.println(name + " Bank deposit..");
	}

	@Override
	public void withdrawl(String name) {
		System.out.println(name + " Bank withdrawl..");
	}

}

interface BankInterface {
	void deposit(String name);

	void withdrawl(String name);

	void interest(int x, int y,String name);
}