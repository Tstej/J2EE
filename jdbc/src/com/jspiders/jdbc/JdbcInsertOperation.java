package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcInsertOperation {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		
		try {
			openConnection();
			statement = connection.createStatement();
			query = "INSERT INTO users VALUES(1, 'Raj', 'raj@gmail.com', 9876543210)";
			statement.execute(query);
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Somethig went wrong");
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root123");
	}
	
	public static void closeConnection() throws SQLException {
		if(connection != null)
			connection.close();
		if(statement != null)
			statement.close();
		if(driver != null)
			DriverManager.deregisterDriver(driver);
	}

}
