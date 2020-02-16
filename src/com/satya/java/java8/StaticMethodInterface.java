package com.satya.java.java8;

public class StaticMethodInterface implements myData {
	
	public static void main(String[] args) {
		StaticMethodInterface s = new StaticMethodInterface();
		s.print("s");
		
	}

}

interface myData {
	default void print(String str) {
		System.out.println(isNull(str));
		if (!isNull(str)) {
			System.out.println("My DATA is ::" + str);
		}
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}