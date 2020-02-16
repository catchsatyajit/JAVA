package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(9);
		al.add(1);
		al.add(2);
		Collections.sort(al);
		/*List<Integer> al2=al.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
		//Iterator<Integer> it=al.iterator();
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.nextIndex()+"-"+it.previousIndex());
			
			
		}*/
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
