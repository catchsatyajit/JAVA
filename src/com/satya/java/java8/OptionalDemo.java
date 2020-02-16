package com.satya.java.java8;


import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		try {
			String[] str = new String[10];
			if (Optional.ofNullable(str[5]).isPresent()) {
				String low = str[5].toUpperCase();
				System.out.println(low);
			} else {
				System.out.println("NO value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
