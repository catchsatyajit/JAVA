package com.satya.java.serialization;

public class Volatile {

	private final static int TOTAL_THREADS = 2;

	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData();

		Thread[] threads = new Thread[TOTAL_THREADS];
		for (int i = 0; i < TOTAL_THREADS; ++i)
			threads[i] = new VolatileThread(volatileData);

		// Start all reader threads.
		for (int i = 0; i < TOTAL_THREADS; ++i)
			threads[i].start();

		// Wait for all threads to terminate.
		for (int i = 0; i < TOTAL_THREADS; ++i)
			threads[i].join();
	}
}

class VolatileData {

	//private volatile int counter = 0;
	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		++counter;
	}
}

class VolatileThread extends Thread {
	private final VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);

		data.increaseCounter();

		int newValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
	}
}
