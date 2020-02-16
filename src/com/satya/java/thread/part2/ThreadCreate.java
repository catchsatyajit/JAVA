package com.satya.java.thread.part2;

public class ThreadCreate {
	private final static int TOTAL_THREAD=3;
	public static void main(String[] args) throws InterruptedException {
	
		/*Count c = new Count();
		Count c2 = new Count();
		c.start();
		c2.start();*/
		
		Thread[] th=new Thread[TOTAL_THREAD];
		MyThread m=new MyThread();
		for(int i=1;i<TOTAL_THREAD;i++) {
			th[i]=new Thread(m);
			th[i].start();
			
		}
		
	}

}

class Count extends Thread {
	private final static int COUNTER = 5;

	public synchronized void run() {
		for (int i = 1; i <= COUNTER; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+"-"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread implements Runnable {

	private final static int COUNTER = 5;

	public  void run() {
		synchronized (this) {
			for (int i = 1; i <= COUNTER; i++) {
				try {
					System.out.println(Thread.currentThread().getName()+"-"+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}