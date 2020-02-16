package com.satya.java.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Cartoons c=new Cartoons();
		c.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.interrupt();
	}

}

class Cartoons extends Thread {
	public void run() {
		while(!Thread.interrupted()){
			System.out.println("Running......");
		}
		System.out.println("stop Running..........");
	}
}