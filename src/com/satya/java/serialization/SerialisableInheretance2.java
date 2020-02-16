package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisableInheretance2 {

	public static void main(String[] args) {
		D b = new D(10, 20);
		System.out.println(b.i);
		System.out.println(b.j);
		try {
			FileOutputStream fout = new FileOutputStream("F:\\Demo.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(b);
			out.close();
			System.out.println("object is serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fin = new FileInputStream("F:\\Demo.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			D b1 = (D) oin.readObject();
			System.out.println(b1.i);
			System.out.println(b1.j);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class C {
	int i;

	C() {

	}

	C(int i) {
		this.i = i;
	}
}

class D extends C implements Serializable {
	private static final long serialVersionUID = 1L;
	int j;

	D() {

	}

	D(int i, int j) {
		super(i);
		this.j = j;
	}
}