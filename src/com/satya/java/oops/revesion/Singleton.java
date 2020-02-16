package com.satya.java.oops.revesion;

public class Singleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		P p = P.getInstance();
		P p2=(P)p.clone();
		
		Adress obj1=p.getObj();
		System.out.println(obj1.getA());
		System.out.println(p.getObj().getA());
		obj1.setA(20);
		System.out.println(obj1.getA());
		System.out.println(p.getObj().getA());

	}

}

class P implements Cloneable {
	private static P a = new P();
	private int b;
	private Adress obj=new Adress();
	private P() {
		obj.setA(10);
	}

	public static P getInstance() {
		return a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

	public int getB() {
		return b;
	}

	public Adress getObj() {
		return obj;
	}

}