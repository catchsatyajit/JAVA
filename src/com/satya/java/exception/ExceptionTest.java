package com.satya.java.exception;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.satya.java.exception.DBExeption.BadExecution;
import com.satya.java.exception.DBExeption.ConnectionError;
import com.satya.java.exception.DBExeption.NoDataExist;

public class ExceptionTest {
	private final static Logger logger=Logger.getLogger(ExceptionTest.class);
	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/spring_hibernate";
		final String user = "root";
		final String password = "admin";
		final String query="SELECT DISTINCT district_name,  FROM district_master WHERE state_id_fk=?";
		
		try (Connection con = (Connection) DriverManager.getConnection(url, user, password);
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);) {
			
			ps.setString(1, "11");
			
			try(ResultSet rs=ps.executeQuery()){
				
				if(rs.next()) {
					do {
						System.out.println("District Name ::"+rs.getString("district_name"));
					}while(rs.next());
				}else {
					try {
						throw new DBExeption.NoDataExist("No Data exist for value ::"+ps.toString());
					} catch (NoDataExist e) {
						logger.error(e.getMessage());
					}
				}
				
			}catch(SQLException e) {
				try {
					throw new DBExeption.BadExecution("Error in SQL :: "+ps.toString());
				} catch (BadExecution e1) {
					logger.debug(e1.getMessage());
				}
			}
		} catch (SQLException e) {
			try {
				throw new DBExeption.ConnectionError("Unable to connection with the URL ["+url+","+user+","+password+" ]");
			} catch (ConnectionError e1) {
				logger.error(e1.getMessage());
			}
		}
	}
}
