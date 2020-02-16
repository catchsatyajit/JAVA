package com.satya.java.generic;

import java.lang.reflect.Constructor;

public class TypeOfObjectCreation {

	public static void main(String[] args) {
		NewInstanceExample n1;
		NewInstanceExample n2;
		NewInstanceExample n3;
		Constructor<NewInstanceExample> obj;
		try {
			n1=new NewInstanceExample();
			n1.view("new key word");
			
			n2 = NewInstanceExample.class.newInstance();
			n2.view("newInstance");
			
			obj=NewInstanceExample.class.getConstructor();
			n3=obj.newInstance();
			n3.view("newInstance method of contructor class");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

class NewInstanceExample {
	
	public void view(String str) {
		System.out.println("Object creation using "+str);
	}
}