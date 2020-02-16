package com.satya.java.java8.revision;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<StudentDO, Integer> items = new TreeMap<StudentDO, Integer>(new CompareName());

		items.put(new StudentDO(5, "Satyajit Roy", 34), 34);
		items.put(new StudentDO(4, "Mitali Sarkar", 32), 32);
		items.put(new StudentDO(3, "Barnali Roy Biswas", 31), 31);
		items.put(new StudentDO(6, "Anirban Biswas", 38), 38);
		items.put(new StudentDO(2, "Ankita Roy", 17), 17);
		items.put(new StudentDO(1, "Tanushree Roy", 16), 16);
		
		
		items.forEach((k, v) -> System.out.println("Values are :"+k.getId()+"-"+k.getName()+"-"+k.getAge()));
	}

}
class CompareName implements Comparator<StudentDO>{

	@Override
	public int compare(StudentDO o1, StudentDO o2) {
		return o1.getAge()-o2.getAge();
	}

	
}
class StudentDO {
	private int id;
	private String name;
	private int age;

	public StudentDO(int id, String name, int age) {
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
		return "["+id+","+name+","+age+"]";
	}
}