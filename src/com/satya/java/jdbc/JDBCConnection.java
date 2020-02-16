package com.satya.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		Connection con =null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmay", "root", "admin");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from actor_master");
			while (rs.next()) {
				System.out.println("ID :"+rs.getString("id"));
				System.out.println("Name :"+rs.getString("actor_name"));
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception sql) {
					sql.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				}catch(Exception sql) {
					sql.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(Exception sql) {
					sql.printStackTrace();
				}
			}
		}

	}

}
