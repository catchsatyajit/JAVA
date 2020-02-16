package com.satya.java.collections.set;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSortComparator {

	public static void main(String[] args) {
		Set<Employee> s2=new HashSet<Employee>();
		Set<Employee> s=new TreeSet<Employee>(new Empl());// this uses comparator
		//Set<Employee> s=new TreeSet<Employee>()); //this uses comparable 
		s.add(new Employee(4, "Satyajit Roy", 34));
		s.add(new Employee(1, "Barnali Roy", 31));
		s.add(new Employee(2, "Mitali Sarkar Roy", 32));
		s.add(new Employee(8, "Anirban Biswas", 38));
		s.add(new Employee(3, "Sonali", 23));
		s.forEach(i->{
			System.out.println(i.getId()+"-"+i.getName()+"-"+i.getAge());
		});
	}

}
class Empl implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		return this.age-o.age;
	}

}