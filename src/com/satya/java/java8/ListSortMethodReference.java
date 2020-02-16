package com.satya.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortMethodReference {

	public static void main(String[] args) {
		//******** Sorting integer array
		int[] a= {9,3,7,1,6,2};
		Arrays.sort(a);
		for(Integer i:a) {
			System.out.println(i);
		}
		//********* End of sorting Integer array *************
		
		//********* sorting string array using method reference  *********
		String[] ar = { "how", "to", "do", "in", "java", "dot", "com" };
		Arrays.sort(ar, String::compareToIgnoreCase);
		for (String s : ar) {
			System.out.println(s);
			
		}
		//********* End of sorting String array *************
		
		//******** Sorting List
		String[] ar2 = { "how", "to", "do", "in", "java", "dot", "com" };
		List<String> lambdaExp = Arrays.asList(ar2);

		// --using lambda expression
		List<String> lambdaEx = lambdaExp.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(lambdaEx);

		// --using Method reference
		List<String> methodReference = lambdaExp.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(methodReference);
	}

}
