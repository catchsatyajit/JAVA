 package com.satya.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		int[] ar=new int[]{1,12,433,5};
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:ar) {
			list.add(i);
		}
		Optional<Integer> maxValue=list.stream().reduce(Math::max);
		maxValue.ifPresent(value -> System.out.println(value)); 
		
		List<String> strArray = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		List<String> l=strArray.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Sorting using lamdba expression ::"+l);
		List<String> methodRef=strArray.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println("Sorting using method reference  ::"+methodRef);
	}

}
