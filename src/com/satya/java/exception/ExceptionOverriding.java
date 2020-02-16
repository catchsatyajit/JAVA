package com.satya.java.exception;

import java.io.IOException;

public class ExceptionOverriding {

	public static void main(String[] args) {
		Junior j=new Junior();
		j.cricket();
	}

}

class Senior {
	public void cricket()  {
		System.out.println("Senior cricket team");
	}
}

class Junior extends Senior {
	public void cricket() throws NullPointerException {
		super.cricket();
		System.out.println("Junior cricket team");
	}
}