package com.satya.java.inner;



import com.satya.java.inner.DBException.DBConnectionException;

public class Test1 {

	public static void main(String[] args) {
		try {

		} catch (Exception r) {
			try {
				throw new DBException.DBConnectionException("Unable to connect....");
			} catch (DBConnectionException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

abstract class GenericException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public GenericException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

class DBException {
	public static class DBConnectionException extends GenericException {

		private static final long serialVersionUID = 1L;

		public DBConnectionException(String message) {
			super(message);
		}
	}

	public static class ArithmeticException extends GenericException {

		private static final long serialVersionUID = 1L;

		public ArithmeticException(String message) {
			super(message);
		}
	}
}
