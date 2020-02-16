package com.satya.java.colelctions.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {
		PriorityBlockingQueue<String> pq = new PriorityBlockingQueue<String>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Jai");
		pq.add("Rahul");
		Iterator<String> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			pq.add("Satya");
		}
		System.out.println(pq.size());
	}

}
