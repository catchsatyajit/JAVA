package com.satya.java.thread;

public class ThreadStop {

	public static void main(String[] args) {
		StopThread t1=new StopThread();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.interrupt();
	}

}
class StopThread extends Thread{
	public void run() {
		System.out.println("checking thread status :"+Thread.interrupted());
		while(!Thread.interrupted()) {
			System.out.println("Running......");
		}
		System.out.println("stop...........");
	}
}