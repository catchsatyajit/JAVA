package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CommonUtils {
	public static void fileWritter(Object o, String filePath) {
		Product p=(Product)o;
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try {
			fout=new FileOutputStream(filePath);
			out=new ObjectOutputStream(fout);
			out.writeObject(p);
			System.out.println("Writing successfully done.....");
			out.flush();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileReader(String filePath) {
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		try {
			fin=new FileInputStream(filePath);
			oin=new ObjectInputStream(fin);
			Product pr=(Product)oin.readObject();
			System.out.println("Reading successfuly done.....");
			System.out.println(pr.getId()+"-"+pr.getName()+"-"+pr.getPrice());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void fileWritterByExternalizable(Object o, String filePath) {
		Wipro p=(Wipro)o;
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try {
			fout=new FileOutputStream(filePath);
			out=new ObjectOutputStream(fout);
			out.writeObject(p);
			System.out.println("Writing successfully done.....");
			out.flush();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void fileReaderByExternalizable(String filePath) {
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		try {
			fin=new FileInputStream(filePath);
			oin=new ObjectInputStream(fin);
			Wipro w=(Wipro)oin.readObject();
			System.out.println(w);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
