package com.satya.java.enm;

public enum MonthEnum {
	January(1), February(2), March(3), April(4), May(5), June(6), July(7), Augest(8), September(9), October(
			10), November(11), December(12);
	private int value;

	private MonthEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
