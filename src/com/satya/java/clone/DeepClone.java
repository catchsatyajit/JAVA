package com.satya.java.clone;

public class DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dept dept = new Dept(1, "HR");
		Student original = new Student(1, "satyajit", dept);
		Student cloned = (Student) original.clone();
		System.out.println("Original object before changing the state :"+original.getDept().getDeptName());
		System.out.println("Cloned object before changing the state   :"+cloned.getDept().getDeptName());
		
		cloned.getDept().setDeptName("ADMIN");
		System.out.println("Original object after changing the state  :"+original.getDept().getDeptName());
		System.out.println("cloned object after changing the state    :"+cloned.getDept().getDeptName());

	}

}

class Dept implements Cloneable {
	private int deptId;
	private String deptName;

	public Dept(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}

class Student implements Cloneable {
	private int studentId;
	private String studentName;
	private Dept dept;

	public Student(int studentId, String studentName, Dept dept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dept = dept;
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

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student cloned = (Student) super.clone();
		cloned.setDept((Dept) cloned.getDept().clone());
		return cloned;
	}

}