package com.satya.java.inner;

public class Demo {

	public static void main(String[] args) {
		//---this portion call the local inner class
		Teacher t=new Teacher();
		t.Data();
		
		//---this portion call the member inner class
		Person p=new Person();
		Person.Tree tr=p.new Tree();
		tr.displayDATA();
		
		//---this portion call the static nested class
		Hotel.Dinner d=new Hotel.Dinner();
		d.displayMessage();
		
		//--this portion call the annonomous class
		new Job() {
			
			@Override
			void task() {
				System.out.println("He is good in his job");
				
			}
		}.task();
		//j.task();
	}

}

//local inner class
class Teacher {
	private int data = 10;
	private final int val = 20;
	public void Data() {
		class LocalInner {
			public void viewDATA() {
				System.out.println("The value is ["+data+","+val+"]");
			}
		}
		LocalInner ln=new LocalInner();
		ln.viewDATA();
	}
}

//member inner class
class Person{
	private int data = 30;
	private final int val = 40;
	class Tree{
		public void displayDATA() {
			System.out.println("The value is ["+data+","+val+"]");
		}
	}
}

//static inner class
class Hotel{
	private static int data=50;
	private final static int val=60;
	static class Dinner{
		public void displayMessage() {
			System.out.println("The value is ["+data+","+val+"]");
		}
	}
}

abstract class Job{
	abstract void task();
}