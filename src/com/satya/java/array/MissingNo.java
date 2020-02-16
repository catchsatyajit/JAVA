package com.satya.java.array;

public class MissingNo {

	public static void main(String[] args) {
		int[] ar=new int[] {1,2,3,4,6};
		int n=6;
		int r=(n*(n+1))/2;
		int res=0;
		for(Integer i:ar) {
			res=res+i;
		}
		System.out.println(res);
		System.out.println(r);
		System.out.println(r-res); 
	}

}
