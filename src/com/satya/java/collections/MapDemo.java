package com.satya.java.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Demo, String> mp = new HashMap<Demo, String>();
	//	Map<Demo, String> mp = new TreeMap<Demo, String>(new TreeSort());
		Demo d1 = new Demo(4, "Demo 4", 4000);
		Demo d2 = new Demo(1, "Demo 1", 1000);
		Demo d3 = new Demo(3, "Demo 3", 3000);
		Demo d4 = new Demo(2, "Demo 2", 2000);
		mp.put(d1, "101");
		mp.put(d2, "201");
		mp.put(d3, "301");
		mp.put(d4, "401");

		for (Map.Entry<Demo, String> m : mp.entrySet()) {
			System.out.println(m.getKey().getId() + " " + m.getKey().getName() + " " + m.getKey().getPrice());
		}
	}

}

class TreeSort implements Comparator<Demo> {

	@Override
	public int compare(Demo o1, Demo o2) {
		return o1.getName().compareTo(o2.getName());
	}

}