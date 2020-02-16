package com.satya.java.string;

public class Test {

	public static void main(String[] args) {
		Age1 age = new Age1(02, 11, 1985);
		StudentDO s = new StudentDO(1, "satya", age);
		System.out.println(s.getAge().getYear());
		age.setYear(1986);
		System.out.println(s.getAge().getYear());
	}

}

final class StudentDO {
	private final int id;
	private final String name;
	private final Age1 age;

	public StudentDO(int id, String name, Age1 age) {
		super();
		this.id = id;
		this.name = name;
		Age1 a=new Age1();
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

	public Age1 getAge() {
		return age;
	}

}

class Age1 {
	private int day;
	private int month;
	private int year;

	public Age1() {

	}

	public Age1(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

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