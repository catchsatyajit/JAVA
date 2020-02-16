package com.satya.java.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
//		int[] array = new int[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		int[] array = new int[] { 5,1,12,-5,16 };
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void quickSort(int[] arr,  int low, int high) {
		// check for empty or null array
		
		System.out.println("Low :"+low +" high ::"+high);
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		// Get the pivot element from the middle of the list
		int middle = low + (high - low) / 2;
		System.out.println("middle ::"+middle);
		int pivot = arr[middle];
		System.out.println("pivot  ::"+pivot);

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			// Check until all values on left side array are lower than pivot
			while (arr[i] < pivot) {
				i++;
			}
			// Check until all values on left side array are greater than pivot
			while (arr[j] > pivot) {
				j--;
			}
			// Now compare values from both side of lists to see if they need swapping
			// After swapping move the iterator on both lists
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		// Do same operation as above recursively to sort two sub arrays
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}

	}

	private static void swap(int[] array, int x, int y) {
		System.out.println("array[x]  ::"+array[x]);
		System.out.println("array[y]  ::"+array[y]);
		int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
		
	}

}
