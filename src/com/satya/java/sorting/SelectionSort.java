package com.satya.java.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar=new int[] {5,1,12,-5,16};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			int min=ar[i];
			for(int j=i+1;j<ar.length;j++) {
				if(min>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
