package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortComparator {

	public static void main(String[] args) {
		List<Doctors> drList = new ArrayList<Doctors>();
		drList.add(new Doctors(5, "Satyajit Roy", 35));
		drList.add(new Doctors(3, "Mitali Sarkar", 33));
		drList.add(new Doctors(1, "Barnali Roy", 31));
		drList.add(new Doctors(2, "Anirban Biswas", 32));
		drList.add(new Doctors(4, "Ankita Roy", 34));
		//Collections.sort(drList, new Doctors());
		/*Collections.sort(drList,new Comparator<Doctors>() {

			@Override
			public int compare(Doctors o1, Doctors o2) {
				//return o1.getAge()-o2.getAge();
				return o1.getName().compareTo(o2.getName());
			}
			
		});*/
		drList.sort(Comparator.comparing(Doctors::getAge).thenComparing(Comparator.comparing(Doctors::getName)));
		
		
		drList.forEach(i->{
			System.out.println(i.getId()+"-"+i.getName()+"-"+i.getAge());
		});
	}

}

class Doctors  {
	private int id;
	private String name;
	private int age;

	public Doctors() {

	}

	public Doctors(int id, String name, int age) {
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

//	@Override
//	public int compare(Doctors o1, Doctors o2) {
//		return o1.getName().compareTo(o2.getName());
//	}

}