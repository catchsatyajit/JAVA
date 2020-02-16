package com.satya.java.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		ConcurrentNavigableMap<String, String> np=new ConcurrentSkipListMap<String, String>(new SortingMap());
		np.put("ND", "New Delhi");
        np.put("MU", "Mumbai");
        np.put("CH", "Chennai");
        np.put("HD", "Hyderabad");
        for(Map.Entry<String, String> m:np.entrySet()) {
        	System.out.println("Kay :"+m.getKey()+" Values :"+m.getValue());
        }
	}

}
class SortingMap implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
