package com.satya.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CopyOnWriteArrayList {

	public static void main(String[] args) {
		List<Integer> numList=new java.util.concurrent.CopyOnWriteArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			numList.add(i);
		}
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				numList.add(6);
				System.out.println(numList);
			}
		}).start();
		
		Iterator<Integer> it=(Iterator<Integer>) numList.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(i);
		}

	}

}
