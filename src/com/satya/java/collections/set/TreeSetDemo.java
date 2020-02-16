package com.satya.java.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		s.add("satyajit");
		s.add("mitali");
		s.add("barnali");
		s.add("bhupati");
		s.add("rekha");
		s.add("satyajit");
		s.add(null);

		s.forEach(System.out::println);
	}

}
