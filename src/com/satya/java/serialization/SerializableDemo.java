package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("F:\\Demo.txt");
			Persion p = new Persion(1, "satyajit", 33);
			ObjectOutputStream o = new ObjectOutputStream(out);
			o.writeObject(p);
			o.close();
			System.out.println("success.....");
		} catch (Exception x) {
			x.printStackTrace();
		}

		try {
			FileInputStream in = new FileInputStream("F:\\Demo.txt");
			ObjectInputStream oin = new ObjectInputStream(in);
			Persion p = (Persion) oin.readObject();
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Persion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private  String name;
	private transient int age;

	public Persion(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
