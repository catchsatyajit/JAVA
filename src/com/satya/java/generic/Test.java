package com.satya.java.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Developer> list = new ArrayList<Developer>();
		list.add(new JavaDeveloper());
		list.add(new JavascriptDeveloper());
		list.add(new HtmlDeveloper());
		ProjectManage p = new ProjectManage(list);
		p.showResult();
	}

}

interface Developer {
	public abstract void develope();
}

class JavaDeveloper implements Developer {

	@Override
	public void develope() {
		writeJAVA();
	}

	private void writeJAVA() {
		System.out.println("java");
	}

}

class JavascriptDeveloper implements Developer {

	@Override
	public void develope() {
		writeJavaScript();
	}

	private void writeJavaScript() {
		System.out.println("Javascript");
	}

}

class HtmlDeveloper implements Developer {

	@Override
	public void develope() {
		writeHTML();
	}

	private void writeHTML() {
		System.out.println("HTML");
	}

}

class ProjectManage {
	List<Developer> list = new ArrayList<Developer>();

	public ProjectManage(List<Developer> list) {
		this.list = list;
	}

	public void showResult() {
		for (Developer d : list) {
			d.develope();
		}
	}
}