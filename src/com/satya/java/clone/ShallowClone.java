package com.satya.java.clone;

public class ShallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department(1, "Finance");
		Employee original = new Employee(10, "satyajit", d);

		Employee cloned = (Employee) original.clone();
			
		cloned.getDepartment().setName("HR");
		System.out.println("original :"+original.getDepartment().getName());
		System.out.println("cloned   :"+cloned.getDepartment().getName());
	}

}

class Employee implements Cloneable {
	private int employeeId;
	private String employeeName;
	private Department department;

	public Employee(int employeeId, String employeeName, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}

class Department {
	private int id;
	private String name;

	public Department(int id, String name) {
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