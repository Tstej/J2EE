package com.jspiders.designpatterns.singleton;


// Lazy Instantiation
public class DatabaseConnection1 {
	
	private static DatabaseConnection1 connection;

	public DatabaseConnection1() {
		super();
	}
	
	public static DatabaseConnection1 getConnection() {
		if(connection == null) {
			connection = new DatabaseConnection1();
		}
		
		return connection;
	}
	

}
