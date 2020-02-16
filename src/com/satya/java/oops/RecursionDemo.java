package com.satya.java.oops;

public class RecursionDemo {

	public static void main(String[] args) {
		RecursionDemo r=new RecursionDemo();
		r.tail(5);
		System.out.println("***********************");
		r.head(5);
		System.out.println(r.sum(5));
	}
	public void tail(int n) {
		if(n==0) {
			return;
		}else {
			System.out.println(n);
		}
		tail(n-1);
	}
	public void head(int n) {
		if(n==0) {
			return;
		}else {
			head(n-1);
		}
		System.out.println(n);
	}
	public int sum(int n) {
		if(n==0) {
			return n;
		}else {
			System.out.println("value of n:"+n);
			return n+sum(n-1);
		}
		
	}

}
