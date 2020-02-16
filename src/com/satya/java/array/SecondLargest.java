package com.satya.java.array;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 14, 46, 47, 86, 92, 52 };
		int largest = arr[0];// 46,47,86,92
		int sl = arr[0];	//  14,46,47,86
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				sl=largest;
				largest=arr[i];
			}
			else if(arr[i]>sl) {
				sl=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(sl);
	}

}
