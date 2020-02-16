package com.satya.java.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {

	public static void main(String[] args) {
		try {
//			ArrayList<Integer> l = new ArrayList<Integer>();
//			l.add(10);
//			l.add(11);
//			l.add(12);
//			l.add(13);
//			Iterator<Integer> listIT=l.iterator();
//			while(listIT.hasNext()) {
//				if(listIT.next()==12) {
//					l.add(14);
//				}
//			}
//			System.out.println("Value of ArrayList after modification ::"+l);

			CopyOnWriteArrayList<Integer> ll = new CopyOnWriteArrayList<Integer>();
			ll.add(3);
			ll.add(4);
			ll.add(5);
			ll.add(6);
			System.out.println("List of value before modification :" + ll);
			Iterator<Integer> it = ll.iterator();
			while (it.hasNext()) {
				if (it.next() == 6) {
					ll.add(9);
				}

			}
			System.out.println("List of value after modification :" + ll);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
