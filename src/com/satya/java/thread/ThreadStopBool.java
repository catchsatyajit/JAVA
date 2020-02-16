package com.satya.java.thread;

public class ThreadStopBool {

	public static void main(String[] args) {
		MyThread td=new MyThread();
		td.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		td.stopRunning();
	}

}

class MyThread extends Thread {
	private boolean flag = true;

	public void stopRunning() {
		flag = false;
	}
	public void run() {
		while(flag) {
			System.out.println("Running........");
		}
		System.out.println("Stop Running..........");
	}
}