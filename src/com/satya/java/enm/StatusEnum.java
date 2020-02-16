package com.satya.java.enm;

public enum StatusEnum {
	Inprogress(1), Active(2), Inactive(3), Rejected(4), Reverted(5), Complete(6);
	private int rank;

	private StatusEnum(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}
}
