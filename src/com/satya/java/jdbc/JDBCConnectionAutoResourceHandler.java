package com.satya.java.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCConnectionAutoResourceHandler {

	public static void main(String[] args) {

		try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pmay",
				"root","admin");
				Statement stmt = (Statement) con.createStatement();
			){
			String sql="select * from actor_master where id='"+10+"'";
			try (ResultSet rs = stmt.executeQuery(sql)) {
				while (rs.next()) {
					System.out.println("ID :" + rs.getString("id"));
					System.out.println("Name :" + rs.getString("actor_name"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
