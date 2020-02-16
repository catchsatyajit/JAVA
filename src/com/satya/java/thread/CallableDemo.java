package com.satya.java.thread;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		System.out.println(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		ExecutorService executor = Executors.newFixedThreadPool(10);
		//ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<String> task1 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return Thread.currentThread().getName();
			}
		};
		Callable<String> task2 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return Thread.currentThread().getName();
			}
		};
		Callable<String> task3 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return Thread.currentThread().getName();
			}
		};

		List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);
		
		List<Future<String>> futures = executor.invokeAll(taskList);
		
		for (Future<String> future : futures) {
			System.out.println(future.get()+"->"+sdf.format(new Date()));
		}
		executor.shutdown();
	}

}
