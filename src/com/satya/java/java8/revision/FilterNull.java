package com.satya.java.java8.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNull {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("satyajit", "mitali", "barnali", null, "anirban", null);
		System.out.println(list);

		List<String> l = list.stream().filter(i -> i != null).collect(Collectors.toList());
		System.out.println(l);
	}
}
