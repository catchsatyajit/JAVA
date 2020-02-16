package com.satya.java.java8.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author user
 *
 */
public class MethodRefference {

	public static void main(String[] args) {

		List<String> strArray = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		System.out.println("before sorting the arraylist    ::" + strArray);

		List<String> usingLambda = strArray.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Sorting using lamdba expression ::" + usingLambda);

		List<String> usingMR = strArray.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println("Sorting using Method Reference  ::" + usingMR);
		
		
	}

}
