package com.satya.java.oops;

public class ObjectCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Branch mech = new Branch(1, "Mechanical");
		Student original = new Student(1, "satyajit", mech);
		Student cloned = (Student) original.clone();
		
		System.out.println(original.getBranch().getName());
		System.out.println(cloned.getBranch().getName());
		
		cloned.getBranch().setName("Computer Science");
		System.out.println(original.getBranch().getName());
		System.out.println(cloned.getBranch().getName());
	}

}

class Student implements Cloneable {
	private int studentId;
	private String studentName;
	private Branch branch;

	public Student(int studentId, String studentName, Branch branch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student cloned = (Student) super.clone();
		cloned.setBranch((Branch) cloned.getBranch().clone());
		return cloned;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;

		return true;
	}

}

class Branch implements Cloneable {
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}