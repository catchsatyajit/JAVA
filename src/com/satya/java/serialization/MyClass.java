package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClass implements Serializable {

	private static final long serialVersionUID = 1L;
	private NonSerial nonSerial;

	MyClass(NonSerial nonSerial) {
		this.nonSerial = nonSerial;
	}

	public static void main(String[] args) {
		NonSerial nonSer = new NonSerial();
		MyClass c = new MyClass(nonSer);
		try {
			FileOutputStream fs = new FileOutputStream("test1.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("test1.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (MyClass) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class NonSerial {
	// This is a non-serializable class
}
