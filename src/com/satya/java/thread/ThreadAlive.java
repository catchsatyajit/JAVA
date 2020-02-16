package com.satya.java.thread;

public class ThreadAlive {

	public static void main(String[] args) {
		Alive a=new Alive();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		t1.start();
		
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
	}

}
class Alive implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i :"+i);
		}
		
	}
	
}