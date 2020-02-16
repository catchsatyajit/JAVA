package com.satya.java.fis;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Future<Integer> f = es.submit(new Calculator(10));
		System.out.println(f.get());
		es.shutdown();
	}

}

class Calculator implements Callable<Integer> {
	private int no;

	public Calculator(int no) {
		this.no = no;
	}

	@Override
	public Integer call() throws Exception {
		return addition(no);
	}

	private Integer addition(int no) {
		int value = 0;
		for (int i = 1; i <= no; i++) {
			value = value + i;
		}
		return value;
	}
}