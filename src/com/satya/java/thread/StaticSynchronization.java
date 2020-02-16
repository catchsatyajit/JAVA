package com.satya.java.thread;

public class StaticSynchronization {

	public static void main(String[] args) {

		new Thread() {
			public void run() {
				Table.printTable(1);
			}
		}.start();
		new Thread() {
			public void run() {
				Table.printTable(10);
			}
		}.start();
		new Thread() {
			public void run() {
				Table.printTable(100);
			}
		}.start();
		

	}

}

class Table {
	public synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
