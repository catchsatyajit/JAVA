package com.satya.java.serialization.revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInheritance {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		FileInputStream fin = null;
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		try {
			B b = new B(10, 10);
			System.out.println("before serialization ::" + "[" + b.i + "," + b.j + "]");
			fout = new FileOutputStream("F:\\Demo.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(b);
			System.out.println("success..........");

			fin = new FileInputStream("F:\\Demo.txt");
			in = new ObjectInputStream(fin);
			B b2 = (B) in.readObject();
			System.out.println("after serialization ::" + "[" + b2.i + "," + b2.j + "]");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				fin.close();
				out.close();
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class A implements Serializable {

	private static final long serialVersionUID = 1L;
	int i;

	public A() {

	}

	public A(int i) {
		this.i = i;
	}

}

class B extends A {
	private static final long serialVersionUID = 1L;
	int j;

	public B() {

	}

	public B(int i, int j) {
		super(i);
		this.j = j;
	}

	private void writeObject(ObjectOutputStream out) throws NotSerializableException {
		// throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream in) throws NotSerializableException {
		// throw new NotSerializableException();
	}
}