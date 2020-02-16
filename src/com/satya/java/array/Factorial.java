package com.satya.java.array;

public class Factorial {

	public static void main(String[] args) {
		int n=6;
		int z=1;
		for(int i=1;i<=n;i++) {
			z=z*i;
		}
		System.out.println("Factorial of "+n+" is :"+z);
	}

}
