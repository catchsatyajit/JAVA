package com.satya.java.array;

public class Palimdrom {

	public static void main(String[] args) {
		int n=454;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
		
		String str="abba";
		boolean result=isPalimdrome(str);
		if(result) {
			System.out.println("Palimdrome");
		}else {
			System.out.println("Not");
		}
	}

	private static boolean isPalimdrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
