package com.satya.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoreOprationOnStream {

	public static void main(String[] args) {
		List<String> mem = new ArrayList<>();
		mem.add("Amitabh");
		mem.add("Shekhar");
		mem.add("Aman");
		mem.add("Rahul");
		mem.add("Shahrukh");
		mem.add("Salman");
		mem.add("Yana");
		mem.add("Lokesh");
		
		long count=mem.stream().count();
		System.out.println("Total no of Member in the list ::"+count);
		
		List<String> nameStartWithA=mem.stream().filter(p->p.startsWith("A")).collect(Collectors.toList());
		System.out.println("List of member whose name start with A ::"+nameStartWithA);
		
		List<String> nameLen=mem.stream().filter(p->p.length()>5).collect(Collectors.toList());
		System.out.println("List of member whose name contain more then 5 alphabets ::"+nameLen);
		
		List<String> sortedList=mem.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorted list of members are  ::"+sortedList);
		
		List<String> sortedUpperLE=mem.stream().sorted().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println("Sorted list of member in UPPER case using Lambda Expression ::"+sortedUpperLE);
		
		List<String> sortedUpperMR=mem.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Sorted list of member in UPPER case using Lambda Expression ::"+sortedUpperMR);
	}

}
