package com.satya.java.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TypesOfObjectCreation {

	public static void main(String[] args) {
		try {
			// ----using NEW key word
			Clothes c1 = new Clothes();
			// ---using clone
			Clothes c2 = (Clothes) c1.clone();
			// ---using newInstance method of Class class
			Clothes c3 = (Clothes) Class.forName("com.satya.java.object.Clothes").newInstance();
			// ---using newInstance method of Constructor class
			Clothes c4 = Clothes.class.getConstructor().newInstance();
			// ---using deserialization
			ObjectInputStream out = new ObjectInputStream(new FileInputStream("F:\\Demo.txt"));
			Clothes c5 = (Clothes) out.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Clothes implements Cloneable {
	private int id;
	private String type;
	private String name;
	public void showDATA() {
		System.out.println("****  SHOW DATA ****");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}