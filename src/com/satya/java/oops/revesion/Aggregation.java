package com.satya.java.oops.revesion;

public class Aggregation {

	public static void main(String[] args) {
		Address add=new Address("786145", "West Sripuria", "Assam", "Tinsukia");
		Employee e=new Employee(1, "Satyajit Roy", add);
		System.out.println(e);
	}

}

class Employee {
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return id + " " + name + " " + address.getCity() + " " + address.getState() 
		+ " " + address.getDistrict() + " "+ address.getPin();
	}

}

class Address {
	private String pin;
	private String city;
	private String state;
	private String district;

	public Address(String pin, String city, String state, String district) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
		this.district = district;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}