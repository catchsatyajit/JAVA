package com.satya.java.thread.part2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExecutor {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		for (int i = 0; i < 10; i++) {
			Job job = new Job("Task " + i);
			System.out.println("A new task has been added : " + job.getName());
			executor.execute(job);
		}
		System.out.println("Maximum threads inside pool " + executor.getMaximumPoolSize());
		executor.shutdown();
	}

}

class Job implements Runnable {
	private String name;

	public Job(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private static final ThreadLocal<SimpleDateFormat> DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		}
	};

	public static String toDateString(Date date) {
		return DATE_FORMAT.get().format(date);
	}

	@Override
	public void run() {
		System.out.println("Starting Thread  ::" + Thread.currentThread().getName() + "-" + toDateString(new Date()));
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Doing a task during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Starting Thread  ::" + Thread.currentThread().getName() + "-" + toDateString(new Date()));
	}

}