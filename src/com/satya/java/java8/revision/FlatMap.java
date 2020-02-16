package com.satya.java.java8.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(7,8,9,10);
		
		List<List<Integer>> list=Arrays.asList(list1,list2,list3);
		
		List<Integer> l=list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(l.toString());
		/*
		List<Integer> mp=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("multiply by 2  ::"+mp);
		
		String[][] str=new String[][] {{"a","b"},{"c","d"},{"e","f"},{"g","h"},{"i","j"}};
		List<String> listOfString=Arrays.stream(str).flatMap(x->Arrays.stream(x)).collect(Collectors.toList());
		System.out.println(listOfString);
		
		List<String> upperList=listOfString.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println("Convert it to UPPER case ::"+upperList);
		
		List<String> upperCaseMR=listOfString.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("upperCaseMR ::"+upperCaseMR);*/
	}

}
