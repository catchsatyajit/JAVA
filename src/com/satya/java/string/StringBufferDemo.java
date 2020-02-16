package com.satya.java.string;

import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*Product p1=new Product(1, "Rice", 850);
		Product p2=new Product(1, "Rice", 850);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);*/
		Map<String, Integer> mp=new HashMap<String, Integer>();
		
		String s2="satyajit roy";
		char[] c=s2.toCharArray();
		for(char s:c) {
			Integer i=mp.get(String.valueOf(s).trim());
			if(!String.valueOf(s).isEmpty()) {
				mp.put(String.valueOf(s), (i==null)?1:i+1);
			}
			
		}
		for(Map.Entry<String, Integer> m:mp.entrySet()) {
			out.println("Key "+m.getKey()+" value "+m.getValue());
		}
		
    }
	

}

class Product {
	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        result = 31 * result + price;
        return result;
	}

	@Override
	public boolean equals(Object o) {
		if(o==this) {
			return true;
		}
		if(!(o instanceof Product)) {
			return false;
		}
		Product p = (Product) o;
		return p.id==id && p.name.equals(name) && p.price==price;
	}

}