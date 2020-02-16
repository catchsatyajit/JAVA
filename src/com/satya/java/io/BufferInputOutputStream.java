package com.satya.java.io;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferInputOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("F:\\Demo.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="welcome to javatpoint";
			byte[] b=s.getBytes();
			bout.write(b);
		//	bout.write(65);
			bout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
