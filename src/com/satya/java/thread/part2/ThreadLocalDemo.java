package com.satya.java.thread.part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {
		DemoTask dt = new DemoTask();
		Thread t1 = new Thread(dt);
		Thread t2 = new Thread(dt);
		Thread t3 = new Thread(dt);
		t1.start();
		t2.start();
		t3.start();
	}

}

class DemoTask implements Runnable {
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending   Thread  ::" + Thread.currentThread().getName() + "-" + toDateString(new Date()));
	}
}