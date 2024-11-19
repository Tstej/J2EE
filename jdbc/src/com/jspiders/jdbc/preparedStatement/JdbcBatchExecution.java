package com.jspiders.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcBatchExecution {

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void main(String[] args) {

		try {
			openConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number of records to be deleted: ");
			int records = scanner.nextInt();

			for (int i = 1; i <= records; i++) {
				System.out.print("Enter id to be deleted: ");
				int id = scanner.nextInt();
				preparedStatement.setInt(i, id);

//				To group multiple records use addBatch()
				preparedStatement.addBatch();
			}
			scanner.close();

//			To execute the batch use executeBatch()  which returns array of INT values
			int[] result = preparedStatement.executeBatch();
			int rows = 0;
			for (int i : result) {
				if (i != 0)
					rows += i;
			}
			System.out.println(rows + " row(s) affected.");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
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
