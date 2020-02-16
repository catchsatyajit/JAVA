package com.satya.java.solid;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		List<Developer> developers=new ArrayList<Developer>();
		developers.add(new BackEndDeveloper());
		developers.add(new FrontEndDeveloper());
		developers.add(new Design());
		Project p=new Project(developers);
		p.implement();
	}

}
class Design implements Developer{
	public void writeDesign() {
		System.out.println("design");
	}

	@Override
	public void develop() {
		writeDesign();
	}
	
}
class BackEndDeveloper implements Developer {
	public void writeJava() {
		System.out.println("java");
	}

	@Override
	public void develop() {
		writeJava();
	}
}

class FrontEndDeveloper implements Developer {
	public void writeJavascript() {
		System.out.println("javascripts");
	}

	@Override
	public void develop() {
		writeJavascript();
	}
}

class Project {
	
	private List<Developer> developers;

	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {
		developers.forEach(d -> d.develop());
	}

}

interface Developer {
	void develop();
}