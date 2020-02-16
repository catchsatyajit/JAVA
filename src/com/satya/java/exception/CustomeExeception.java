package com.satya.java.exception;

public class CustomeExeception extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomeExeception() {

	}

	public CustomeExeception(String meseeage) {
		super(meseeage);
	}
}
