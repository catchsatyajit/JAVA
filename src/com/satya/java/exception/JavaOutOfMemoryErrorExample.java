package com.satya.java.exception;



public class JavaOutOfMemoryErrorExample {

	public static void main(String[] args) {
		Integer x=null;
		try {
			x=Integer.parseInt("aa");
		}catch(NullPointerException|ArithmeticException |NumberFormatException n) {
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
			throw e;
		}finally {
			System.out.println(x);
		}
		

	}

}
