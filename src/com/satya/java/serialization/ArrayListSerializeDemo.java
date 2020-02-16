package com.satya.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSerializeDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("satyajit");
		list.add("satyajit2");
		list.add("satyajit3");
		list.add("satyajit4");
		list.add("satyajit5");
		try {
			FileOutputStream fout=new FileOutputStream("F:\\Demo.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(list);
			out.close();
			System.out.println("Serialization has been done...");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fin=new FileInputStream("F:\\Demo.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			List<String> l=(List<String>)in.readObject();
			l.forEach((n)->{
				System.out.println(n);
			});
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
