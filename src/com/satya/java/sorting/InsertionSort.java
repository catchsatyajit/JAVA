package com.satya.java.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] ar = new int[] { 64, 34, 24, 12, 22, 11, 90 };
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

}
