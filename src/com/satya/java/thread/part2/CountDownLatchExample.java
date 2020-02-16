package com.satya.java.thread.part2;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) {
		CountDownLatch letch = new CountDownLatch(4);
		WorkerThread first = new WorkerThread(1000, letch, "WORKER-1");
		WorkerThread second = new WorkerThread(2000, letch, "WORKER-2");
		WorkerThread third = new WorkerThread(3000, letch, "WORKER-3");
		WorkerThread fourth = new WorkerThread(4000, letch, "WORKER-4");
		first.start();
		second.start();
		third.start();
		fourth.start();
		try {
			letch.await();
			System.out.println(Thread.currentThread().getName() + " finished...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class WorkerThread extends Thread {
	private int delay;
	private CountDownLatch letch;
	private String name;

	public WorkerThread(int delay, CountDownLatch letch, String name) {
		super();
		this.delay = delay;
		this.letch = letch;
		this.name = name;
	}

	public void run() {
		try {
			Thread.sleep(delay);
			System.out.println("count down is ::" + letch.getCount());
			letch.countDown();
			System.out.println(Thread.currentThread().getName() + " finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}