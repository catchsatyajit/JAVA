package com.satya.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("F:\\Demo.txt");
//			fout.write(65);
	
			String s="Welcome to javaTpoint.";   
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("succsss....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
