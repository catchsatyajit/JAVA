package com.satya.java.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {

	public static void main(String[] args){
		User user = new User(1, "SatyajitRoy","Pass@1234");
		User u=null;
		try {
			FileOutputStream fout=new FileOutputStream("F:\\Demo.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(user);
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin=new FileInputStream("F:\\Demo.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			u=(User)in.readObject();
			System.out.println(u);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

class User implements Externalizable {
	private int id;
	private String userName;
	private String pwd;

	public User() {
		System.out.println("no-args constructor");
	}

	public User(int id, String userName, String pwd) {
		super();
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("In write external");
		//out.writeInt(id);
		out.writeObject(userName);
		out.writeObject(pwd);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("In read external");
		//id = in.readInt();
		userName = (String) in.readObject();
		pwd=(String)in.readObject();
	}
	public String toString() {
		return ("Id: " + id + " " + "userName: " + userName + " " + "pwd: " + pwd);
	}
}