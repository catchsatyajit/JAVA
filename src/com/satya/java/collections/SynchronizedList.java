package com.satya.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedList implements Runnable {
	private List<Integer> numList;

	public SynchronizedList(List<Integer> numList) {
		this.numList = numList;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			numList.add(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// List<Integer> numList=new CopyOnWriteArrayList<Integer>();
		// List<Integer> numList=Collections.synchronizedList(new ArrayList<Integer>());
		List<Integer> numList = new ArrayList<Integer>();
		Thread t1 = new Thread(new SynchronizedList(numList));
		Thread t2 = new Thread(new SynchronizedList(numList));
		Thread t3 = new Thread(new SynchronizedList(numList));
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		numList.forEach((n -> {
			System.out.println(n);
		}));
	}

}
