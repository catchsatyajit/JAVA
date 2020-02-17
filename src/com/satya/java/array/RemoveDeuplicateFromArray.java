package com.satya.java.array;

import java.util.Arrays;

public class RemoveDeuplicateFromArray {

	public static void main(String[] args) {
		
		int a[]={3,2,1,4,2,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int b=0;
		a[b]=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[b]!=a[i]) {
				b++;
				a[b]=a[i];
			}
		}
		for(int i=0;i<=b;i++) {
			System.out.print(a[i]+"\t");
		}

	}

}
