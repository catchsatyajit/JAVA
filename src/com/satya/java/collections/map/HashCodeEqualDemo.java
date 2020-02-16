package com.satya.java.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashCodeEqualDemo {

	public static void main(String[] args) {
		Contact contact1 = new Contact(1, "satyajit", "9678934051");
		Contact contact2 = new Contact(1, "satyajit", "9678934051");
		//System.out.println(contact1.equals(contact2));
		/*List<Contact> list=new ArrayList<Contact>();
		list.add(contact1);
		list.add(contact2);
		if(list.contains(new Contact(1, "satyajit", "9678934051"))) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}*/
		Set<Contact> set=new HashSet<Contact>();
		set.add(contact1);
		set.add(contact2);
		if(set.contains(new Contact(1, "satyajit", "9678934051"))) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
	}

}

class Contact {
	private int id;
	private String name;
	private String phNo;

	public Contact(int id, String name, String phNo) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
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

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	@Override
	public int hashCode() {
		return 12*id+name.hashCode()+phNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Contact c = (Contact) obj;
		return (c.getId() == this.getId() && c.getName() == this.getName());
	}

}