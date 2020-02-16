package com.satya.java.reflection;

public class RelectionDemo {
	void printName(Object obj) {
		Class<? extends Object> c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.satya.java.reflection.Simple");
		System.out.println(c.getName());
		Simple s=new Simple();
		RelectionDemo r=new RelectionDemo();
		r.printName(s);
		
		
		Class<String> str=String.class;
		System.out.println(str.getName());
		
		Class<Boolean> b=Boolean.class;
		System.out.println(b.getName());
		
		Class<Simple> sim=Simple.class;
		System.out.println(sim.getName());
		
	}

}
