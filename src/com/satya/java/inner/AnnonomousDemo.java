package com.satya.java.inner;

public class AnnonomousDemo {

	public static void main(String[] args) {
		final int data = 30;
		River r = new River() {
			@Override
			void waterFlow() {
				System.out.println(data);
			}
		};
		r.waterFlow();

	}

}

abstract class River {
	abstract void waterFlow();
}