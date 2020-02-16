package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisableInheretance3 {

	public static void main(String[] args) {
		Lock l = new Lock(20, 30);
		try {
			FileOutputStream fout = new FileOutputStream("F:\\Demo.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(l);
			out.close();
			System.out.println("Object is serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fin = new FileInputStream("F:\\Demo.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			Lock lock = (Lock) in.readObject();
			System.out.println(lock.i);
			System.out.println(lock.j);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Key implements Serializable {
	private static final long serialVersionUID = 1L;
	int i;

	Key(int i) {
		this.i = i;
	}
}

class Lock extends Key {
	int j;

	Lock(int i, int j) {
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