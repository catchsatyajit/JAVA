package com.satya.java.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
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
