package com.satya.java.thread.part2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		// executor using runnable
		es.submit(new Plus(10));
		// executor using Callable
		Future<Integer> f = es.submit(new Addition(10));
		try {
			System.out.println("Total is ::" + f.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		es.shutdown();
	}
}

class Addition implements Callable<Integer> {
	private int no;

	public Addition(int no) {
		this.no = no;
	}

	@Override
	public Integer call() throws Exception {
		return calculate(no);
	}

	private int calculate(int n) {
		int ctr = 0;
		for (int i = 1; i <= n; i++) {
			ctr = ctr + i;
		}
		return ctr;
	}
}

class Plus implements Runnable {
	private int no;

	public Plus(int no) {
		this.no = no;
	}

	@Override
	public void run() {
		int ctr = 0;
		for (int i = 1; i <= no; i++) {
			ctr = ctr + i;
		}
		System.out.println("The SUM of the value is ::" + ctr);

	}

}
