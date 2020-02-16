package com.satya.java.thread.part2;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {
		ScheduledExecutorService ec=Executors.newScheduledThreadPool(2);
		Task t1=new Task("Task 1");
		Task t2=new Task("Task 2");
		System.out.println("The time is ::"+new Date());
		ec.schedule(t1, 5, TimeUnit.SECONDS);
		ec.schedule(t2, 10, TimeUnit.SECONDS);
		try {
			ec.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ec.shutdown();
	}

}

class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		try {
			System.out.println("Doing a task during : " + name + " - Time - " + new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}