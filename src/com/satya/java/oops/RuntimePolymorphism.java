package com.satya.java.oops;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		PointB b=new PointB();
		b.show();

	}

}
class PointA{
	public void show() {
		System.out.println("PointA");
	}
	public static int data=20;
}
class PointB extends PointA{

	public void show() {
		//super.show();//calling the parent class method
		
		System.out.println("PointB");
	}
	
}