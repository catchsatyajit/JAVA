package com.satya.java.inner;

public class MemberInnerDemo {

	public static void main(String[] args) {
		MemberInner mi=new MemberInner();
		MemberInner.Inner in=mi.new Inner();
		in.display();
	}

}

class MemberInner {
	private int data = 10;
	private final int val=29;
	class Inner {
		public void display() {
			System.out.println(data+" "+val);
		}
	}
}