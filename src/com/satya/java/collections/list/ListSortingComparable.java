package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingComparable {

	public static void main(String[] args) {
		List<Doctor> drList=new ArrayList<Doctor>();
		drList.add(new Doctor(5, "Satyajit Roy", 35));
		drList.add(new Doctor(3, "Mitali Sarkar", 33));
		drList.add(new Doctor(1, "Barnali Roy", 31));
		drList.add(new Doctor(2, "Anirban Biswas", 32));
		drList.add(new Doctor(4, "Ankita Roy", 34));
		//Collections.sort(drList);
		drList.sort((Doctor d1,Doctor d2)->d1.getId()-d2.getId());
		drList.forEach(i->{
			System.out.println(i.getId()+"-"+i.getName()+"-"+i.getAge());
		});
	}

}

class Doctor implements Comparable<Doctor>{
	private int id;
	private String name;
	private int age;

	public Doctor(int id, String name, int age) {
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
	public int compareTo(Doctor o) {
		return this.age-o.age;
	}

}