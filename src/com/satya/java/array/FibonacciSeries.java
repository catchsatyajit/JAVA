package com.satya.java.array;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		System.out.print(i+","+j);
		int z=0;
		while(z<10) {
			z=i+j;
			System.out.print(","+z);
			i=j;
			j=z;
		}

	}

}
