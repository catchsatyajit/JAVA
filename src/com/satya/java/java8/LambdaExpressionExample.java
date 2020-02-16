package com.satya.java.java8;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		Painting p = new Painting() {

			@Override
			public void paint(int x, int y) {
				System.out.println("Calling annonomous way..." + (x * y));

			}
		};
		p.paint(22, 20);

		Painting p1 = (a, b) -> {
			System.out.println("using Lambda Expression....." + (a * b));
		};
		p1.paint(12, 13);

		Calculator c = (a, b) -> {
			return (a + b);
		};
		int x = c.addition(12, 13);
		System.out.println("Value of x ::" + x);
		
		Addition a=(l,k,t)->{
			return (l+k+t);
		};
		int result=a.add(10, 20, 30);
		System.out.println(result);
	}

}

@FunctionalInterface
interface Painting {
	public void paint(int x, int y);
}

@FunctionalInterface
interface Calculator {
	public int addition(int x, int y);
}

@FunctionalInterface
interface Addition {
	public int add(int x, int y, int z);
}