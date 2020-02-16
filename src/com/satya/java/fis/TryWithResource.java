package com.satya.java.fis;

public class TryWithResource {

	public static void main(String[] args) {
		try(Demo d=new Demo(1, "satya", 33)){
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

class Demo implements AutoCloseable{
	private int id;
	private String name;
	private int age;

	public Demo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void close() throws Exception {
		System.out.println("auto closable");
		
	}

}