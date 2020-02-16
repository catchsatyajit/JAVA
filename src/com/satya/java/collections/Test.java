package com.satya.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(new Apple("red"), 10);
		m.put(new Apple("red"), 20);
		for (Map.Entry<Apple, Integer> m2 : m.entrySet()) {
			System.out.println(m2.getKey().getColor() + "-" + m2.getValue() + "-" + m2.hashCode());
		}

		Map<TCS, String> mp = new HashMap<TCS, String>();
		mp.put(new TCS(1, "satyajit"), "101");
		mp.put(new TCS(1, "satyajit"), "102"); 
		System.out.println(mp.size());
		for (Map.Entry<TCS, String> m2 : mp.entrySet()) {
			System.out.println(m2.getKey().hashCode());
		}

	}

}

class TCS {
	private int id;
	private String name;

	public TCS(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return 12 * id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		TCS c = (TCS) obj;
		return (c.getId() == this.getId() && c.getName() == this.getName());
	}

}

class Apple {
	private String color;

	public Apple(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean equals(Object obj) {
		Apple a = (Apple) obj;
		return (a.color == this.color);
	}

	public int hashCode() {
		return 12 * color.hashCode();
	}
}