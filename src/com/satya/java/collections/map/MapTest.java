package com.satya.java.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(601, "Anirban", 40033625));
		list.add(new Employee(301, "Mitali", 30033625));
		list.add(new Employee(101, "Kunal", 10033625));
		list.add(new Employee(501, "Sonali", 50033625));
		list.add(new Employee(201, "Satyajit", 20033625));
		list.add(new Employee(401, "Barnali", 40033625));
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int empId;
	public Employee() {
		
	}
	public Employee(int id, String name, int empId) {
		super();
		this.id = id;
		this.name = name;
		this.empId = empId;
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int compareTo(Employee o) {
//		return this.getName().compareTo(o.getName());
		return this.getId()-o.getId();
	}
	public String toString() {
		return id+"-"+name+"-"+empId;
	}
	
}