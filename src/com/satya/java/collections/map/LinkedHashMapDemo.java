package com.satya.java.collections.map;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp=new LinkedHashMap<Integer, String>();
		mp.put(34, "Satyajit");
		mp.put(31, "Barnali");
		mp.put(32, "Mitali");
		mp.put(37, "Anirban");
		mp.put(18, "Sonali");
		for(Map.Entry<Integer, String> m:mp.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}

	}

}
