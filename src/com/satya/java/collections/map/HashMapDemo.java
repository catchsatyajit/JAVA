package com.satya.java.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class HashMapDemo {

	public static void main(String[] args) {
		//----in java 7 way
		Map<StudentDO, Integer> mp = new TreeMap<StudentDO, Integer>(new AgeSort());
		mp.put(new StudentDO(1, "Satyajit", 34, 55000), 304);
		mp.put(new StudentDO(2, "Barnali", 31, 35000), 301);
		mp.put(new StudentDO(3, "Mitali", 32, 22000), 302);
		mp.put(new StudentDO(4, "Anirban", 37, 70000), 307);
		mp.put(new StudentDO(5, "Sonali", 18, 10000), 108);

		for (Map.Entry<StudentDO, Integer> m : mp.entrySet()) {
			System.out.println("[ name :" + m.getKey().getName() + " age :" + m.getKey().getAge() + " salary : "
					+ m.getKey().getSalary());
		}
		
		
	}

}

class AgeSort implements Comparator<StudentDO> {

	@Override
	public int compare(StudentDO o1, StudentDO o2) {
		return o2.getSalary()-o1.getSalary();
	}

}

class StudentDO {
	private int id;
	private String name;
	private int age;
	private int salary;

	public StudentDO(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
