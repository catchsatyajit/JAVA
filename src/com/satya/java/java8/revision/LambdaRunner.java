package com.satya.java.java8.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaRunner {

	public static void main(String[] args) {
		List<Capgemini> cap=new ArrayList<Capgemini>();
		cap.add(new Capgemini(123, "satyajit roy", 50000));
		cap.add(new Capgemini(125, "prasanta borah", 70000));
		cap.add(new Capgemini(127, "anil das", 55000));
		cap.add(new Capgemini(121, "anirban biswas", 60000));
		
		Collections.sort(cap,(p1,p2)->{
			return p1.getSalary()-p2.getSalary();
		});
		cap.forEach((n->{
			System.out.println(n.getId()+"-"+n.getName()+"-"+n.getSalary());
		}));
		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		List<String> sortedList=strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		sortedList.forEach((n->{
			System.out.print(n+" ");
		}));
		System.out.println();
		int total=cap.stream().filter(i->i.getSalary()>=50000).mapToInt(i->i.getSalary()).sum();
		System.out.println(total);
		
	}

}
class Capgemini{
	private int id;
	private String name;
	private int salary;
	
	public Capgemini(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}