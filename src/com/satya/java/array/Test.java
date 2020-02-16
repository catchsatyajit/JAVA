package com.satya.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		A a=new A();
		List l=new ArrayList();
		a.sum(l);
		Animal animal=(x,y)->{
			System.out.println("Dog "+(x+y));
		};
		animal.dog(10,12);
	}

}
class A{
	public void sum(List list) {
		System.out.println("list");
	}
	public void sum(ArrayList al) {
		System.out.println("al");
	}
}

interface Animal{
	public abstract void dog(int a,int b);
}