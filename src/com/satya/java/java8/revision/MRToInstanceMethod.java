package com.satya.java.java8.revision;

/**
 * Method reference to an instance method of an object – object::instanceMethod
 */
public class MRToInstanceMethod {
	public void myMethod() {
		System.out.println("Inatance method");
	}

	public static void main(String[] args) {
		MRToInstanceMethod m=new MRToInstanceMethod();
		MyInterface m1=m::myMethod;
		m1.display();
	}

}

@FunctionalInterface
interface MyInterface {
	void display();
}