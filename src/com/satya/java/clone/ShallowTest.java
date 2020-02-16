package com.satya.java.clone;

public class ShallowTest {

	public static void main(String[] args) {
		Branch branch =null;
		College original=null;
		College copy=null;
		try {
			branch = new Branch(1, "Mechanical");
			original = new College(1, "JEC", branch);
			copy = (College) original.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("before modification original :"+original.getBranch().getName());
		System.out.println("before modification clone    :"+copy.getBranch().getName());
		copy.getBranch().setName("CSC");
		System.out.println("after modification original  :"+original.getBranch().getName());
		System.out.println("after modification clone     :"+copy.getBranch().getName());
	}

}

class College implements Cloneable {
	private int id;
	private String name;
	private Branch branch;

	public College(int id, String name, Branch branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
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

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Branch {
	private int id;
	private String name;

	public Branch(int id, String name) {
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

}