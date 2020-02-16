package com.satya.java.java8.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {
		Math m = new Math() {
			@Override
			public void addValue(int x, int y) {
				System.out.println("Sum of the values are  ::" + (x + y));
			}
		};
		m.addValue(10, 12);

		Math m2 = (a, b) -> System.out.println("Sum of the values are  ::" + (a + b));
		m2.addValue(20, 11);

		PointA p = (a, b) -> {
			return (a + b);
		};
		System.out.println("Sum of the values are  ::" + p.sumValue(30, 20));

		List<ProductDO> l = new ArrayList<ProductDO>();
		l.add(new ProductDO(5, "e", 400));
		l.add(new ProductDO(4, "d", 100));
		l.add(new ProductDO(3, "c", 200));
		l.add(new ProductDO(2, "b", 500));
		l.add(new ProductDO(1, "a", 400));

		Collections.sort(l, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});

		long count = l.stream().filter(p1 -> p1.getPrice() > 200).distinct().count();
		System.out.println("Total no of element ::" + count);

		int totalAmount = l.stream().filter(p2 -> p2.getPrice() > 200).distinct()
				.mapToInt(i -> Integer.parseInt(String.valueOf(i.getPrice()))).sum();
		System.out.println("value are :" + totalAmount);

		List<ProductDO> list = l.stream().filter(p1 -> p1.getPrice() > 200).collect(Collectors.toList());
		list.forEach((n -> {
			System.out.println(n.getId() + "-" + n.getName() + "-" + n.getPrice());
		}));

		EmployeeDO[] e = { new EmployeeDO("Satyajit Roy"), new EmployeeDO("Mitali Sarkar"),
				new EmployeeDO("Barnali Roy"), new EmployeeDO("Anirban Biswas") };

		System.out.println("Before Sorting ::" + Arrays.toString(e));
		Arrays.sort(e, EmployeeDO::nameCompare);
		System.out.println("Before Sorting ::" + Arrays.toString(e));
	}

}

@FunctionalInterface
interface Math {
	public void addValue(int x, int y);
}

@FunctionalInterface
interface PointA {
	public int sumValue(int x, int y);
}

class ProductDO {
	private int id;
	private String name;
	private long price;

	public ProductDO(int id, String name, long price) {
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

class EmployeeDO {
	private String name;

	public EmployeeDO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static int nameCompare(EmployeeDO e1, EmployeeDO e2) {
		return e1.getName().compareTo(e2.getName());
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}