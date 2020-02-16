package com.satya.java.thread.part2;

public class StaticSynchronization {

	public static void main(String[] args) {
		final DataShared ds = new DataShared();
		new Thread() {
			public void run() {
				try {
					ds.valueCount(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				try {
					ds.valueCount(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

	}

}

class DataShared {
	public synchronized static void valueCount(int n) throws InterruptedException {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i * n);
			Thread.sleep(1000);
		}
	}
}