package com.satya.java.java8.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSorting {

	public static void main(String[] args) {
		List<DLDC> list = new ArrayList<DLDC>();
		list.add(new DLDC(2, "Satyajit Roy", 34));
		list.add(new DLDC(3, "Mitali Sarkar", 33));
		list.add(new DLDC(4, "Anirban Biswas", 38));
		list.add(new DLDC(1, "Barnali Roy", 32));

		System.out.println("Sorting using lambda expression :");
		Collections.sort(list, (s1, s2) -> s1.getAge() - s2.getAge());
		list.forEach(System.out::println);
		
		System.out.println("Sorting using method reference  :");
		Collections.sort(list, DLDC::ageCompare);
		list.forEach(System.out::println);
	}

}

class DLDC {
	private int id;
	private String name;
	private int age;

	public static int nameCompare(DLDC d1, DLDC d2) {
		return d1.getName().compareTo(d2.getName());
	}

	public static int ageCompare(DLDC d1, DLDC d2) {
		return d1.getAge() - d2.getAge();
	}

	public DLDC(int id, String name, int age) {
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

	public String toString() {
		return "[" + id + "," + name + "," + age + "]";
	}
}