package com.satya.java.exception;

public class DBExeption {
	// SQL execution error
	public static class BadExecution extends BaseException {

		private static final long serialVersionUID = 1L;

		public BadExecution(String message) {
			super(message);
		}

	}

	// No data exist where we expect at least one row
	public static class NoDataExist extends BaseException {

		private static final long serialVersionUID = 1L;

		public NoDataExist(String message) {
			super(message);
		}

	}

	// Multiple rows exist where we expect only single row
	public static class MoreData extends BaseException {

		private static final long serialVersionUID = 1L;

		public MoreData(String message) {
			super(message);
		}

	}

	// Invalid parameters error
	public static class InvalidParam extends BaseException {

		private static final long serialVersionUID = 1L;

		public InvalidParam(String message) {
			super(message);
		}

	}
	//connection error
	public static class ConnectionError extends BaseException{

		private static final long serialVersionUID = 1L;

		public ConnectionError(String message) {
			super(message);
		}
		
	}
}
