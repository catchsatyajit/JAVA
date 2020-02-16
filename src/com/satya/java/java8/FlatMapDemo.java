package com.satya.java.java8;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		List<Integer> list3 = Arrays.asList(9, 10, 11, 12);
		List<Integer> list = Arrays.asList(list1, list2, list3).stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		
		int maximumValue=list.stream().max(Integer::compareTo).get();
		out.println("maximumValue ::"+maximumValue);
		int minimumValue=list.stream().min(Integer::compareTo).get();
		out.println("minimumValue ::"+minimumValue);

	}

}
