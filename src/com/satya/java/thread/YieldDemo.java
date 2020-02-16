package com.satya.java.thread;

public class YieldDemo {

	public static void main(String[] args) {
		Thread consumer=new Consumer();
		Thread producer=new Producer();
		consumer.setPriority(Thread.MIN_PRIORITY);
		producer.setPriority(Thread.MAX_PRIORITY);
		consumer.start();
		producer.start();
		
	}

}

class Producer extends Thread {
	public void run() {
		for (int i =1; i <= 5; i++) {
			System.out.println("Producer Thread " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Consumer Thread " + i);
			Thread.yield();
		}
	}
}