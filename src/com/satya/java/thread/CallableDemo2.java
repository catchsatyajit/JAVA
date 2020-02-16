package com.satya.java.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.mysql.fabric.xmlrpc.base.Data;

public class CallableDemo2 implements Callable<String> {

	public static void main(String[] args) {
		// ----Thread pool size is 10
		ExecutorService executor = Executors.newFixedThreadPool(10);

		List<Future<String>> list = new ArrayList<Future<String>>();

		Callable<String> callable = new CallableDemo2();

		for (int i = 0; i < 11; i++) {
			Future<String> future = executor.submit(callable);
			list.add(future);
		}
		for (Future<String> f : list) {
			try {
				System.out.println(new Date() + "-" + f.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();

	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

}
