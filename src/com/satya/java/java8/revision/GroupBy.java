package com.satya.java.java8.revision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Orange", "Mango", "Apple", "Mango", "Mango");
		Map<String, Long> groupBy = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(groupBy);

		List<Item> items = Arrays.asList(new Item(10, "apple", 200), new Item(11, "banana", 60),
				new Item(12, "orange", 50), new Item(13, "watermilon", 150), new Item(14, "apple", 200),
				new Item(15, "apple", 200), new Item(16, "banana", 60), new Item(17, "pineapple", 120));
		
		System.out.println(items);
		
		Map<String, Long> mp=items.stream().collect(Collectors.groupingBy(i->i.getName(),Collectors.counting()));
		System.out.println("mp ::"+mp);
	}

}

class Item {
	private int id;
	private String name;
	private int price;

	public Item(int id, String name, int price) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "{" + id + "," + name + "," + price+"}";
	}
}