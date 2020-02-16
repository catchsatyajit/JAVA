package com.satya.java.oops;

public class InstanceOfDemo {

	public static void main(String[] args) {
		Water w=new Water();
		Milk m=new Milk();
		System.out.println(m instanceof Water);
		System.out.println(m instanceof Milk);
		System.out.println(w instanceof Milk);
	}

}
class Water{
	
}
class Milk extends Water{
	
}