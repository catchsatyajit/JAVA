package com.satya.java.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindWordCount {

	public static void main(String[] args) {
		int[] a=new int[10];
		System.out.println(a.length);
		List<String> l = new ArrayList<String>();
		System.out.println(l.size());
		int[] ar = new int[] { 1, 2, 7, 2, 5, 7, 7, 8, 1 };
		Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();
		for (Integer i : ar) {
			Integer j = mp.get(i);
			mp.put(i, (j == null) ? 1 : j + 1);
		}
		for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		System.out.println("**************************************************");
		List<String> list = new ArrayList<String>();
		list.add("satyajit");
		list.add("mitali");
		list.add("barnali");
		list.add("anirban");
		list.add("satyajit");
		list.add("satyajit");
		list.add("barnali");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String s : list) {
			Integer m = map.get(s);
			map.put(s, (m == null) ? 1 : m + 1);
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
	}
}
