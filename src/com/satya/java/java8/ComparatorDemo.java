package com.satya.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> em = new ArrayList<Employee>();
		em.add(new Employee(6, "Yash", "Chopra", 25));
		em.add(new Employee(2, "Aman", "Sharma", 28));
		em.add(new Employee(3, "Aakash", "Yaadav", 52));
		em.add(new Employee(5, "David", "Kameron", 19));
		em.add(new Employee(4, "James", "Hedge", 72));
		em.add(new Employee(8, "Balaji", "Subbu", 88));
		em.add(new Employee(7, "Karan", "Johar", 59));
		em.add(new Employee(1, "Lokesh", "Gupta", 32));
		em.add(new Employee(9, "Vishu", "Bissi", 33));
		em.add(new Employee(10, "Lokesh", "Ramachandran", 60));

		System.out.println("*************** Sorting by AGE ***************");
		em.sort((Employee e1,Employee e2)->e1.getAge()-e2.getAge());
		em.forEach(i->{
			System.out.println(i);
		});
		System.out.println("*********** Sorting by First Name *************");
		em.sort((Employee e1,Employee e2)->e1.getFirstName().compareTo(e2.getFirstName()));
		em.forEach(i->{
			System.out.println(i);
		});
		
		

	}

}

class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

	public Employee(Integer id, String firstName, String lastName, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\n[" + this.id + "," + this.firstName + "," + this.lastName + "," + this.age + "]";
	}

}