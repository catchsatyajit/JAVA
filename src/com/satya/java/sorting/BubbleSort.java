package com.satya.java.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = new int[] { 64, 34, 24, 12, 22, 11, 90 };
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length - 1; j++) {
				System.out.println(Arrays.toString(ar));
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				} else {
					continue;
				}
			}
		}
		System.out.println("The sorted array is ::" + Arrays.toString(ar));

	}

}
