package com.satya.java.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Demo d1=new Demo(4, "Demo 4", 4000);
		Demo d2=new Demo(1, "Demo 1", 1000);
		Demo d3=new Demo(3, "Demo 3", 3000);
		Demo d4=new Demo(2, "Demo 2", 2000);
		
		Set<Demo> demoSet=new TreeSet<Demo>(new SetComparator());
		
		demoSet.add(d1);
		demoSet.add(d2);
		demoSet.add(d3);
		demoSet.add(d4);
		demoSet.forEach((n->{
			System.out.println(n);
		}));
	}

}
class SetComparator implements Comparator<Demo>{

	@Override
	public int compare(Demo o1, Demo o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
class Demo {
	private int id;
	private String name;
	private long price;

	public Demo(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + price;
	}

}