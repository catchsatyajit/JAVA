package com.satya.java.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Test {

	public static void main(String[] args) {
		String filePath = "F:\\Demo.txt";
		Wipro w = new Wipro(2, "satyajit", 55000);
		Product p = new Product(1, "TV", 13000);

		CommonUtils.fileWritter(p, filePath);
		CommonUtils.fileReader(filePath);

		CommonUtils.fileWritterByExternalizable(w, filePath);
		CommonUtils.fileReaderByExternalizable(filePath);
	}

}

class Wipro implements Externalizable {
	private int id;
	private String name;
	private long salary;

	public Wipro() {
		System.out.println("no-args constructor");
	}

	public Wipro(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(salary);
		System.out.println("Write External use for writing.....");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
		salary = (long) in.readObject();
		System.out.println("Write External use for writing.....");
	}

	public String toString() {
		return ("Id: " + id + " " + "userName: " + name + " " + "pwd: " + salary);
	}

}

class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}