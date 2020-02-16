package com.satya.java.string;

public class Immutable {

	public static void main(String[] args) {
		Age a=new Age();
		a.setDay(02);
		a.setMonth(11);
		a.setYear(1985);
		immutableStudent im=new immutableStudent(1, "Satyajit Roy", a);
		System.out.println(im.getAge().getYear());
		a.setYear(1986);
		System.out.println(im.getAge().getYear());
	}

}

final class immutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public immutableStudent(int id, String name, Age age) {
		super();
		this.id = id;
		this.name = name;
		Age a=new Age();
		a.setDay(age.getDay());
		a.setMonth(age.getMonth());
		a.setYear(age.getYear());
		this.age = a;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

}

class Age {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}