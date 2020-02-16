package com.satya.java.oops;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StaticDemo {

	public static void main(String[] args) {
		Lion lion=null;
		System.out.println(lion instanceof Lion);
		Lion l = new Lion();
		System.out.println(l instanceof Animal);
		System.out.println(l instanceof Lion);
		l.display();
		Lion.show();
		l.paint();
		Lion.tiger();
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(4,"Oil", 260));
		list.add(new Product(3,"Rice", 850));
		list.add(new Product(2,"Pulse", 150));
		list.add(new Product(1,"Extra", 1000));
		List<Integer> ll=list.stream().map(p->p.getPrice()).distinct().collect(Collectors.toList());
		int maxValue=Collections.max(ll);
		int minValue=Collections.min(ll);
		System.out.println(maxValue);
		System.out.println(minValue);
		int sum=list.stream().map(p->p.getPrice()).distinct().collect(Collectors.summingInt(p->p));
		System.out.println(sum);
	}

}

class Animal {
	public final int val = 20;
	public int data = 20;
	public static int value = 9;

	public final void paint() {
		System.out.println("paint");
	}

	public static void tiger() {
		System.out.println("tiger");
	}
}

class Lion extends Animal {
	public void display() {
		System.out.println(val + " " + data + " " + value);
	}

	public static void show() {
		System.out.println(value);
	}

}

class Product {
	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}