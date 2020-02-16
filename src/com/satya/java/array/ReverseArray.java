package com.satya.java.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ar2 = new int[ar.length];
		int j=0;
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
			ar2[j]=ar[i];
			j++;
		}
		System.out.println(Arrays.toString(ar2));
	}

}
