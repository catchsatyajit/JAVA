package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("satyajit");
		list.add("anirban");
		list.add("barnali");
		list.add("mitali");
		if(!list.isEmpty()) {
			ListIterator<String> lt=list.listIterator();
			while(lt.hasNext()) {
				System.out.println("Next Index :"+lt.nextIndex()+" Previous Index :"+lt.previousIndex()+" value :"+lt.next());
			}
		}
	}

}
