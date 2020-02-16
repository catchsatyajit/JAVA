package com.satya.java.array;

public class MinMaxValue {

	public static void main(String[] args) {
		int[] ar=new int[] {10, 324, 45, 90, 9808};
		int max=ar[0];
		int min=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		int addMaxMin=min+max;
		double avgMaxMin=(min+max)/2;
		System.out.println("Maximum value is ::"+max);
		System.out.println("Minimum value is ::"+min);
		System.out.println("Sum of Maximum & Minimum values ::"+addMaxMin);
		System.out.println("Average of Maximum & Minimum values ::"+avgMaxMin);
	}

}
