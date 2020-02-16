package com.satya.java.string;

public class IndexOf {

	public static void main(String[] args) {
		String s = "this is a long sentence";
		int firstOccurance=s.indexOf("long");
		System.out.println("firstOccurance ::"+firstOccurance);
		int lastOccurance=s.lastIndexOf('i');
		System.out.println("lastOccurance  ::"+lastOccurance);

	}

}
