package com.satya.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		//Map<String, String> mp = new ConcurrentHashMap<String, String>();
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Satyajit Roy", "33");
		mp.put("Barnali Roy", "31");
		mp.put("Mitali Sarkar", "32");
		mp.put("Munmun Biswas", "33");
		mp.put("Bandana Das", "21");
		Iterator<String> it = mp.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(mp.get(it.next()));
			mp.put("Sonali Roy", "17");
		}
	}

}
