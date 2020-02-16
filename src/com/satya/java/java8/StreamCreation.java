package com.satya.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(1,2,3,4,5,6,7);
		st.forEach(p->{
			System.out.println(p);
		});
		
		Stream<Integer> ar=Stream.of(new Integer[] {1,2,3,4,5,6,7,8});
		ar.forEach(n->{
			System.out.println(n);
		});
		
		List<Integer> ll=new ArrayList<Integer>();
		for(int i=1;i<11;i++) {
			ll.add(i);
		}
		Stream<Integer> list=ll.stream();
		list.forEach(l->{
			System.out.println(l);
		});
		
		

	}

}
