package com.satya.java.enm;



public class EnumDemo {
	private enum weekday {
		Monday, Tuesday, Wednesday, Thruesday, Friday, Saturday, Sunday;
	}

	public enum Language {
		JAVA(1), PYTHON(2), PERL(3), SCALA(4);
		private int rank;

		private Language(int rank) {
			this.rank = rank;
		}

		public int getRank() {
			return rank;
		}

	}

	public static void main(String[] args) {
		for (weekday w : weekday.values()) {
			System.out.println(w);
		}

		for (Language l : Language.values()) {
			System.out.println("The order " + l.ordinal());
		}
	

	}

}
