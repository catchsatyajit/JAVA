package com.satya.java.sorting;

public class MinimunValueArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 64, 25, 12, 22, 11 };
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		StringBuffer sb=new StringBuffer();
		for(Integer a:arr) {
			sb.append(a).append(",");
		}
		sb.replace(sb.length()-1, sb.length(), "");
		System.out.println(sb.toString());
		
		String str="11,12,22,25,64,";
		System.out.println(str.substring(0, str.length()-1));
	}

}
