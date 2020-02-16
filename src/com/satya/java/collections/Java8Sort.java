package com.satya.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Java8Sort {

	public static void main(String[] args) {
		List<String> ll=new LinkedList<>();
		Demo d1=new Demo(4, "Demo 4", 4000);
		Demo d2=new Demo(1, "Demo 1", 1000);
		Demo d3=new Demo(3, "Demo 3", 3000);
		Demo d4=new Demo(2, "Demo 2", 2000);
		List<Demo> list=new ArrayList<Demo>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.sort((Demo o1,Demo o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		list.forEach((n->{
			System.out.println(n);
		}));
	}

}
