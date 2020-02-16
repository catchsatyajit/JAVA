package com.satya.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 3, 2, 5, 7, 7, 8, 1 };
		List<Integer> uniqueList = new ArrayList<Integer>();
		List<Integer> duplicateList = new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (!uniqueList.contains(ar[i])) {
				uniqueList.add(ar[i]);
			} else {
				duplicateList.add(ar[i]);
			}
		}
		Object[] duplicateO = duplicateList.toArray();
		Object[] uniqueO = uniqueList.toArray();

		System.out.println(Arrays.toString(duplicateO));
		System.out.println(Arrays.toString(uniqueO));

		ArrayList<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		Map<String, Integer> hm = new HashMap<String, Integer>(); 
		  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 

	}

}
