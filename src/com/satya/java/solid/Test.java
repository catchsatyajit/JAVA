package com.satya.java.solid;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Programer> list=new ArrayList<Programer>();
		list.add(new SpringBoot());
		list.add(new SpringMVC());
		SpringProject sp=new SpringProject(list);
		sp.implement();
	}

}

class SpringProject {
	List<Programer> list = new ArrayList<Programer>();

	public SpringProject(List<Programer> list) {
		this.list = list;
	}

	public void implement() {
		list.forEach(d -> d.programmer());
	}
}

class SpringBoot implements Programer {

	@Override
	public void programmer() {
		writeSpringBoot();

	}

	private void writeSpringBoot() {
		System.out.println("Spring Boot");

	}

}

class SpringMVC implements Programer {

	@Override
	public void programmer() {
		writeSpring();
	}

	private void writeSpring() {
		System.out.println("Spring MVC");

	}

}

interface Programer {
	public abstract void programmer();
}