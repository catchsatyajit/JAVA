package com.satya.java.fis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("satyajit");
		list.add("prasanta");
		list.add("aniket");
		list.add("satyajit");
		list.add("prasanta");
		list.add("aniket");
		System.out.println(list);
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);
	}

}
