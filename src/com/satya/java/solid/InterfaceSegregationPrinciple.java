package com.satya.java.solid;

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.feed();
		Dog d=new Dog();
		d.feed();
		d.groom();
	}
}

interface Animal {
	public abstract void feed();
}

interface Domestic {
	public abstract void groom();
}

class Tiger implements Animal {

	@Override
	public void feed() {
		System.out.println("Tiger Feed");
	}
}

class Dog implements Animal, Domestic {
	@Override
	public void feed() {
		System.out.println("Dog Feed");
	}

	@Override
	public void groom() {
		System.out.println("Dog groom");
	}
}