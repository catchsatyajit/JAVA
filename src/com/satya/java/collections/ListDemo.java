package com.satya.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		Pink p1=new Pink(3, "Rice", 800);
		Pink p2=new Pink(1, "Oil", 300);
		Pink p3=new Pink(4, "Palse", 250);
		Pink p4=new Pink(2, "Vegitable", 700);
		List<Pink> pinkList=new ArrayList<Pink>();
		pinkList.add(p1);
		pinkList.add(p2);
		pinkList.add(p3);
		pinkList.add(p4);
		Collections.sort(pinkList,new ListComparator());
		pinkList.forEach((n->{
			System.out.println(n.getId()+" "+n.getName()+" "+n.getPrice());
		}));
	}

}
class ListComparator implements Comparator<Pink>{

	@Override
	public int compare(Pink o1, Pink o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}

class Pink{
	private int id;
	private String name;
	private long price;

	public Pink(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


}