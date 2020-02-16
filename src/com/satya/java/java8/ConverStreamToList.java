package com.satya.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverStreamToList {

	public static void main(String[] args) {
		try {
			List<Integer> ll = new ArrayList<Integer>();
			for (int i = 1; i < 101; i++) {
				ll.add(i);
			}
			
			long count = ll.stream().filter(i -> i % 5 == 0).count();
			System.out.println("Total count is ::" + count);
			
			List<Integer> l = ll.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
			l.forEach(p -> {
				System.out.println(p);
			});

			Integer[] ar = ll.stream().filter(i -> i % 5 == 0).toArray(Integer[]::new);
			System.out.println(ar);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
