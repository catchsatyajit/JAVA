package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<String>();
		//List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Bangalore");
		list.add("Delhi");
		list.add("Mumbai");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("Kolkata");
		}
		
	}

}
