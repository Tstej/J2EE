package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabse2 {
	
	private static Driver driver;
	private static Statement statement;
	private static Connection connection;
	private static  String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			
			statement = connection.createStatement();
			query = "CREATE DATABASE test";
			statement.execute(query);
			System.out.println("Database created");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
//		DB Created using getConnection(String, String, String)
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root123");
	}
	
	private static void closeConnection() throws SQLException {
		if(statement != null)
			statement.close();
		if(connection != null)
			connection.close();
		if(driver != null)
			DriverManager.deregisterDriver(driver);
	}
	
	

}
