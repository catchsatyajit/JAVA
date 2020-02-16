package com.satya.java.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {

	public static void main(String[] args) {
//		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer, String>();
		Map<Integer, String> chm=new HashMap<Integer, String>();
		chm.put(1, "India");
		chm.put(2, "Pakistan");
		chm.put(3, "Australi");
		chm.put(4, "Brazil");
		chm.put(5, "Srilanka");
		Iterator<Integer> it=chm.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer) it.next();
			System.out.println(key+"->"+chm.get(key));
			chm.put(6, "China");
		}
		System.out.println(chm);
	}

}
