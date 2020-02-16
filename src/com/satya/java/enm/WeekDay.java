package com.satya.java.enm;

public enum WeekDay {
	Monday, Tuesday, Wednesday, Thruesday, Friday, Saturday, Sunday;
	public int value() {
		switch (this) {
		case Monday:
			return 1;
		case Tuesday:
			return 2;
		case Wednesday:
			return 3;
		case Thruesday:
			return 4;
		case Friday:
			return 5;
		case Saturday:
			return 6;
		case Sunday:
			return 7;
		default:
			return 0;
		}
	}
}
