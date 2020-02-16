package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("satyajit");
		list.add("mitali");
		list.add("barnai");
		list.add("anirban");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
