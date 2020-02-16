package com.satya.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedListDemo implements Runnable {
	private List<Integer> list;

	public SynchronizedListDemo(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			list.add(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		//List<Integer> list=Collections.synchronizedList(new ArrayList<Integer>());
		List<Integer> list=new CopyOnWriteArrayList<Integer>();
		Thread t1=new Thread(new SynchronizedListDemo(list));
		Thread t2=new Thread(new SynchronizedListDemo(list));
		Thread t3=new Thread(new SynchronizedListDemo(list));
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
		list.forEach((n->{
			System.out.println(n);
		}));

	}

}
