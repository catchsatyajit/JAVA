package com.satya.java.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FailFast {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("ONE", 1);
		mp.put("TWO", 2);
		mp.put("THREE", 3);
		mp.put("FOUR", 4);
		Iterator<String> it = mp.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + mp.get(key));
			mp.put("FIVE", 5);
		}
		
		
	}

}
