package com.satya.java.oops;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer s1 = new Integer(10);
		Integer s2 = new Integer(10);
		Integer i1 = 40;
		Integer i2 = 40;
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(s1 == s2);
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(112);
		l.add(112);
		l.add(new Integer(112));
		l.add(new Integer(112));
		System.out.println(l.get(0)==l.get(1));
		System.out.println(l.get(2)==l.get(3));
		
		
	}

}
