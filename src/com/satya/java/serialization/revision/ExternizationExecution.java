package com.satya.java.serialization.revision;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternizationExecution {

	public static void main(String[] args) {
		FileOutputStream fout=null;
		FileInputStream fin=null;
		ObjectOutputStream out=null;
		ObjectInputStream in=null;
		try {
			Person p=new Person(1, "Satyajit Roy", 34);
			fout=new FileOutputStream("F:\\Demo.txt");
			out=new ObjectOutputStream(fout);
			out.writeObject(p);
			System.out.println("Success........");
			
			fin=new FileInputStream("F:\\Demo.txt");
			in=new ObjectInputStream(fin);
			Person p2=(Person)in.readObject();
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
				out.close();
				in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}

class Person implements Externalizable {

	private int id;
	private String name;
	private transient int age;

	public Person() {

	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		//out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		name=(String) in.readObject();
		//age=in.readInt();
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
	public String toString() {
		return ("Id: " + id + " " + "userName: " + name+" "+ "age :"+age);
	}
}