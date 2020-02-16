package com.satya.java.thread.part2;

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		final SharedData sd = new SharedData();
		new Thread() {
			public void run() {
				try {
					sd.valueCount(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					sd.valueCount(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

	}

}

class SharedData {
	public void valueCount(int n) throws InterruptedException {
		synchronized(this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+"-"+i * n);
				Thread.sleep(1000);
			}
		}
		
	}
}
