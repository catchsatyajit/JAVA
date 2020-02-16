package com.satya.java.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodOverloading {

	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.add(10, 12));
		System.out.println(c.add(10, 12, 13));
		System.out.println(c.add("Satyajit ","Roy"));
		List<String> l=new ArrayList<String>();
		l.add("satyajit");
		l.add("barnali");
		l.add("mitali");
		Collections.reverse(l);
		System.out.println(l);
	}

}

class Calculation {
	public int add(int a, int b) {
		return (a + b);
	}

	public int add(int a, int b, int c) {
		return (a + b + c);
	}

	public String add(String x,String y) {
		return (x+y);
	}
}