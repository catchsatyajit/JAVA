package com.satya.java.thread.part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		Counter c=new Counter();
		
		for(int i=0;i<100;i++) {
			service.submit(()->c.increment());
		}
		
		service.shutdown();
		System.out.println("Total count ::"+c.getCount());

	}

}

class Counter {
	int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}