package com.satya.java.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		// Let us create task that is going to wait for 4 threads before it starts
		CountDownLatch latch = new CountDownLatch(4);

		// Let us create four worker threads and start them.
		Worker first = new Worker(1000, latch, "WORKER-1");
		Worker second = new Worker(2000, latch, "WORKER-2");
		Worker third = new Worker(3000, latch, "WORKER-3");
		Worker fourth = new Worker(4000, latch, "WORKER-4");

		first.start();
		second.start();
		third.start();
		fourth.start();

		try {
			// The main task waits for four threads
			latch.await();

			// Main thread has started
			System.out.println(Thread.currentThread().getName() + " has finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Worker extends Thread {
	private int delay;
	private CountDownLatch latch;
	private String name;

	public Worker(int delay, CountDownLatch latch, String name) {
		super();
		this.delay = delay;
		this.latch = latch;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			System.out.println("count down is :" + latch.getCount());
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " finished");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}