package com.satya.java.string;

public class SpilttingString {

	public static void main(String[] args) {
		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
		String[] dataCells = lineFromCsvFile.split(";");
		for(String s:dataCells) {
			System.out.println(s);
		}
		
		String lineFromInput = "What do you need from me?";
		String[] words = lineFromInput.split("\\s+"); // one or more space chars
		for(String s:words) {
			System.out.println(s);
		}
	}

}
