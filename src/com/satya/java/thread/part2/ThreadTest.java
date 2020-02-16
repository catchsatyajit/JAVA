package com.satya.java.thread.part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Sum a = new Sum();
		for (int i = 0; i < 100; i++) {
			es.submit(() -> a.increament());
		}
		es.shutdown();
		System.out.println(a.getValue());
	}

}

class Sum {
	int counter = 0;

	public synchronized void increament() {
		counter++;
	}

	public int getValue() {
		return counter;
	}
}