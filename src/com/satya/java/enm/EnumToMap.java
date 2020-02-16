package com.satya.java.enm;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EnumToMap {
	public enum Number {
		One, Five, Three, Four,Two;
	}
	
	public static void main(String[] args) {
		EnumMap<Number, String> mp = new EnumMap<Number, String>(Number.class);
		mp.put(Number.One, "1");
		mp.put(Number.Two, "2");
		mp.put(Number.Three, "3");
		mp.put(Number.Four, "4");
		mp.put(Number.Five, "5");
		System.out.println(mp);
		for (Map.Entry<Number, String> m : mp.entrySet()) {
			System.out.println(m.getKey().name());
		}
		
		TreeMap<Number, String> tm=new TreeMap<Number, String>();
		tm.put(Number.Five, "5");
		tm.put(Number.Three, "3");
		tm.put(Number.One, "1");
		tm.put(Number.Four, "4");
		tm.put(Number.Two, "2");
		System.out.println(tm);
		
		Set<Number> ts=new TreeSet<Number>();
		ts.add(Number.One);
		ts.add(Number.Two);
		ts.add(Number.Four);
		ts.add(Number.Five);
		ts.add(Number.Three);
		System.out.println(ts);
		for(Number n:ts) {
			System.out.println(n.name());
		}
	}

}
