package com.satya.java.inner;

public class LocalInnerDemo {

	public static void main(String[] args) {
		LocalInner ln=new LocalInner();
		ln.display();

	}

}

class LocalInner {
	private int data = 9;

	public void display() {
		class Inner {
			public void show() {
				System.out.println(data);
			}
		}
		Inner in=new Inner();
		in.show();
	}
}