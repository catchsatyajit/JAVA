package com.satya.java.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * ByteArrayOutputStream :is used to write common data in to multiple file
 */
public class ByteArrayInputOutputStream {

	public static void main(String[] args) {
		try {

			FileOutputStream fout1 = new FileOutputStream("F:\\Demo.txt");
			FileOutputStream fout2 = new FileOutputStream("F:\\Demo2.txt");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			out.write(65);
			out.writeTo(fout1);
			out.writeTo(fout2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
