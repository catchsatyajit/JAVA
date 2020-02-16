package com.satya.java.thread.part2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.submit(new Calculate(20));
		Future<Integer> f=es.submit(new Adding(10));
		try {
			System.out.println(f.get());
		} catch (InterruptedException |ExecutionException e) {
			e.printStackTrace();
		}
	}

}

class Adding implements Callable<Integer> {
	private int no;

	public Adding(int no) {
		this.no = no;
	}

	@Override
	public Integer call() throws Exception {
		return addValue(no);
	}
	public int addValue(int no) {
		int ctr = 0;
		for (int i = 1; i <= no; i++) {
			ctr = ctr + i;
		}
		return ctr;
	}
}

class Calculate implements Runnable {
	private int no;

	public Calculate(int no) {
		this.no = no;
	}

	@Override
	public void run() {
		int ctr = 0;
		for (int i = 1; i <= no; i++) {
			ctr = ctr + i;
		}
		System.out.println("Total using runnabe interface ::" + ctr);

	}

}
