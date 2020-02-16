package com.satya.java.array;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int a=0;
		int c=0;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		System.out.println(c);
	}

}
