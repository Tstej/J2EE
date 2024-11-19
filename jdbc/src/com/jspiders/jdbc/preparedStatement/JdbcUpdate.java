package com.jspiders.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdate {

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID to update contact: ");
		int id = scanner.nextInt();
		System.out.println("Enter Mobile number to update contact: ");
		Long mobile = scanner.nextLong();
		
		try {
			openConnection();
			preparedStatement = connection.prepareStatement("UPDATE users SET mobile = ? WHERE id = ?");
			preparedStatement.setLong(1, mobile);
			preparedStatement.setInt(2, id);
			
			int row = preparedStatement.executeUpdate();
			System.out.println(row + "row(s) affected.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root123");
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null)
			preparedStatement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}

}
