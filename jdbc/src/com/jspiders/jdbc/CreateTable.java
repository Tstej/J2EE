package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
//		Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Register the driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
//		Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root123");
		
//		Create statements
		Statement statement = connection.createStatement();
		
//		Execute the statements
		statement.execute("CREATE TABLE users(id int primary key, name varchar(20) not null, email varchar(20) not null unique, mobile bigInt(10) not null unique)");
		
		System.out.println("Table Created");
		
//		Close the connections and statements
		connection.close();
		statement.close();
		
//		Deregister the driver
		DriverManager.deregisterDriver(driver);
	}

}
