package com.satya.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		List<String> lambdaSorting = list.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("lambdaSorting :" + lambdaSorting);
		
		List<String> mrSorting = list.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println("mrSorting :" + mrSorting);
		
		List<TCS> tcs=new ArrayList<TCS>();
		tcs.add(new TCS(3, 34, "Satyajit Roy"));
		tcs.add(new TCS(1, 30, "Barnali Roy"));
		tcs.add(new TCS(2, 32, "Mitali Sarkar"));
		tcs.add(new TCS(4, 38, "Anirban Biswas"));
		Collections.sort(tcs,(s1,s2)->s1.getName().compareTo(s2.getName()));
		tcs.forEach((n->{
			System.out.println(n.getId()+"-"+n.getAge()+"-"+n.getName());
		}));
		
		List<String> ll=Arrays.asList("TCS","Wipro Limited","Infosys","Accenture",
				"Capgemini","Cognizent","Infogain","Mind Tree");
		List<String> filter=ll.stream().filter(p->p.startsWith("C")).collect(Collectors.toList());
		System.out.println("Filter ::"+filter);
		
		List<String> str=Arrays.asList("1","2","3","4","5");
		int intStr=str.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(intStr);
		
	}

}

class TCS {
	private int id;
	private int age;
	private String name;

	public TCS(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
