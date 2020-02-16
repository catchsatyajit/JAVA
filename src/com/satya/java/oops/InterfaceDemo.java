package com.satya.java.oops;

public class InterfaceDemo {

	public static void main(String[] args) {
		UBI ubi=new UBI();
		ubi.deposit();
		ubi.withdrawl();
		System.out.println(ubi.interest(10, 10));

	}

}

interface BankFunctionality {
	abstract void deposit();

	abstract void withdrawl();

	abstract int interest(int x,int y);
}
class UBI implements BankFunctionality{

	@Override
	public void deposit() {
		System.out.println("******interface deposit******");
	}

	@Override
	public void withdrawl() {
		System.out.println("******interface withdrawl******");
		
	}

	@Override
	public int interest(int x,int y) {
		return (x*y*10);
	}
	
}