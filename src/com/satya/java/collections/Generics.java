package com.satya.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("123");
		
		for(String o:list) {
			
			System.out.println(o);
		}
	}

}
