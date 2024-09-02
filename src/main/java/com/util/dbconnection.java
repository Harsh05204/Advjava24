package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class dbconnection {

	
	public static void main(String args[]) {
		
		String url = "jdbc:mysql://localhost:3306/24advjava";
		String dbName ="root";
		String dbPass = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,dbName,dbPass);
			System.out.println("connection=>"+connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
