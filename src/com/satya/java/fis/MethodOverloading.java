package com.satya.java.fis;

import java.util.ArrayList;
import java.util.List;

public class MethodOverloading {

	public static void main(String[] args) {

		A a = new A();
		List l = new ArrayList();
		a.sum(l);
		ArrayList al = new ArrayList();
		a.sum(al);

	}

}

class A {
	public void sum(List list) {
		System.out.println("list");
	}

	public void sum(ArrayList al) {
		System.out.println("al");
	}
}
