package com.satya.java.inner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.satya.java.inner.DataBaseException.BadExceptions;
import com.satya.java.inner.DataBaseException.ConnectionException;
import com.satya.java.inner.DataBaseException.NoDataExists;

public class Test {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/spring_hibernate";
		final String user = "root";
		final String password = "admin";
		final String query = "SELECT DISTINCT district_name, FROM district_master WHERE state_id_fk=?";
		try (Connection con = (Connection) DriverManager.getConnection(url, user, password);
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(query)) {
			ps.setString(1, "11");
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					do {
						System.out.println(rs.getString("district_name"));
					} while (rs.next());
				} else {
					try {
						throw new DataBaseException.NoDataExists("No records found with this :" + ps.toString());
					} catch (NoDataExists e) {
						System.out.println(e.getMessage());
					}
				}
			} catch (SQLException e) {
				try {
					throw new DataBaseException.BadExceptions("Error in SQL :: " + ps.toString());
				} catch (BadExceptions e2) {
					System.out.println(e2.getMessage());
				}

			}

		} catch (SQLException e) {
			try {
				throw new DataBaseException.ConnectionException("failed to connect......");
			} catch (ConnectionException e1) {
				System.out.println(e1.getMessage());
			}
		}

	}

}

abstract class BasedException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public BasedException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

class DataBaseException {
	public static class BadExceptions extends BasedException {

		private static final long serialVersionUID = 1L;

		public BadExceptions(String message) {
			super(message);
		}
	}

	public static class ConnectionException extends BasedException {

		private static final long serialVersionUID = 1L;

		public ConnectionException(String message) {
			super(message);
		}
	}

	public static class NoDataExists extends BasedException {

		private static final long serialVersionUID = 1L;

		public NoDataExists(String message) {
			super(message);
		}
	}

	public static class SQLQueryException extends BasedException {

		private static final long serialVersionUID = 1L;

		public SQLQueryException(String message) {
			super(message);
		}

	}
}
