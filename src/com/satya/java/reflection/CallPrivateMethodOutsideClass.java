package com.satya.java.reflection;

import java.lang.reflect.Method;

public class CallPrivateMethodOutsideClass {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.satya.java.reflection.A");
			Object o=c.newInstance();
			Method m=c.getDeclaredMethod("viewRecords", null);
			
			Method m2=c.getDeclaredMethod("areaOfSquare", new Class[]{int.class});
			m.setAccessible(true);
			m.invoke(o, null);
			m2.setAccessible(true);
			m2.invoke(o, 4);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}

class A {
	private void viewRecords() {
		System.out.println("*****  DATA  *****");
	}
	private void areaOfSquare(int n) {
		System.out.println("The AREA of a SQUARE is :"+n*n);
	}
}