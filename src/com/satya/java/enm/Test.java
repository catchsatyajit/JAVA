package com.satya.java.enm;

public enum Test {
	Adecco(1), NIC(2), Medhassu(3), Wipro(4);
	private int val;

	Test(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
}
