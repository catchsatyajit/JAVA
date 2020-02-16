package com.satya.java.fis;

public class LambdaExample {

	public static void main(String[] args) {
		Calculate c=(a,b)->{
			System.out.println("Sum of the value is :"+(a+b));
		};
		c.add(10, 12);

	}

}
interface Calculate{
	void add(int a,int b);
}