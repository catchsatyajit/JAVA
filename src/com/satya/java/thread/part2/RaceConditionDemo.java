package com.satya.java.thread.part2;

public class RaceConditionDemo {

	public static void main(String[] args) throws InterruptedException {
		Calculator c=new Calculator();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}

}

class Calculator implements Runnable{
	int i = 0;

	public void increamentValue() throws InterruptedException {
		i++;
		Thread.sleep(1000);
	}

	public void decreamentValue() throws InterruptedException {
		i--;
		Thread.sleep(1000);
	}

	public int getValue() {
		return i;
	}

	@Override
	public synchronized void run(){
		//synchronized (this) {
			try {
				this.increamentValue();
				System.out.println("Value after increament by :"+Thread.currentThread().getName()+"-"+this.getValue());
				this.decreamentValue();
				System.out.println("Value after decreament by :"+Thread.currentThread().getName()+"-"+this.getValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		//}
		
	}
}