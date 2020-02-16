package com.satya.java.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Bus> ll = new LinkedList<Bus>();
		ll.add(new Bus(5, "AS-105", 515));
		ll.add(new Bus(3, "AS-103", 513));
		ll.add(new Bus(6, "AS-106", 516));
		ll.add(new Bus(4, "AS-104", 514));
		ll.add(new Bus(1, "AS-101", 511));
		ll.add(new Bus(2, "AS-102", 512));
		
		ll.sort((Bus b1,Bus b2)->b1.getBusNo().compareTo(b2.getBusNo()));
		
		ll.forEach(i->{
			System.out.println(i.getId()+"-"+i.getBusNo()+"-"+i.getPrice());
		});

	}

}

class Bus {
	private int id;
	private String busNo;
	private long price;

	public Bus(int id, String busNo, long price) {
		super();
		this.id = id;
		this.busNo = busNo;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}