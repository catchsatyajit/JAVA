package com.satya.java.thread.part2;

public class ThreadLocalTest {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		t1.start();
		t2.start();
	}

}

class MyRunnable implements Runnable {
	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	@Override
	public synchronized void run() {
		threadLocal.set((int) (Math.random() * 50D));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocal.get());
	}

}