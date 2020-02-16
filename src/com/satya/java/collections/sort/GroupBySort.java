package com.satya.java.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupBySort {

	public static void main(String[] args) {
		List<Employee> list2 = new ArrayList<Employee>(8);
		System.out.println("capacity provided ::"+list2.size());
		List<Employee> list = new ArrayList<Employee>();
		System.out.println("Empty arraylist   ::"+list.size());
		list.add(new Employee(2, "Satyajit", "Roy"));
		list.add(new Employee(1, "Barnali", "Roy"));
		list.add(new Employee(4, "Mitali", "Sarkar"));
		list.add(new Employee(5, "Anirban", "Biswas"));
		list.add(new Employee(3, "Sonali", "Roy"));
		list.add(new Employee(7, "Barnali", "Sarkar"));
		list.add(new Employee(6, "Mitali", "Roy"));
		
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		
		Collections.sort(list,compareByName);
		list.forEach(i->{
			System.out.println("Employee ["+i.getId()+","+i.getFirstName()+" "+i.getLastName()+"]");
		});
	}
}

class Employee{
	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	

}