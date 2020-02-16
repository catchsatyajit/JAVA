package com.satya.java.serialization.revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExecution {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			System.out.println("...Serialization start here..........");
			Users u = new Users(1, "Satyajit Roy", 34);
			fout = new FileOutputStream("F:\\Demo2.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(u);
			

			System.out.println("...Desirialization start here........");
			fin = new FileInputStream("F:\\Demo2.txt");
			oin = new ObjectInputStream(fin);
			Users user = (Users) oin.readObject();
			System.out.println(user.getId() + "-" + user.getName() + "-" + user.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				out.close();
				fin.close();
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient int age;

	public Users(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(this.age);
	}

	public void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
		this.age = in.readInt();
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