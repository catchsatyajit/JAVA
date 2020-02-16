package com.satya.java.clone;

public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Wing wing=new Wing(1, "HR");
		Company original=new Company(1, "TCS", wing);
		Company cloned=(Company)original.clone();
		System.out.println("before modification original ::"+original.getName());
		System.out.println("before modification cloned   ::"+cloned.getName());
		cloned.setName("Finance");
		System.out.println("after modification original ::"+original.getName());
		System.out.println("after modification cloned   ::"+cloned.getName());
	}
}

class Company implements Cloneable {
	private int id;
	private String name;
	private Wing wing;

	public Company(int id, String name, Wing wing) {
		super();
		this.id = id;
		this.name = name;
		this.wing = wing;
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

	public Wing getWing() {
		return wing;
	}

	public void setWing(Wing wing) {
		this.wing = wing;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Company cloned = (Company) super.clone();
		cloned.setWing((Wing) cloned.getWing().clone());
		return cloned;
	}

}

class Wing implements Cloneable {
	private int id;
	private String name;

	public Wing(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}