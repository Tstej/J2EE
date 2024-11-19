package com.jspiders.designpatterns.singleton;

public class DatabaseConnection2 {
	private static DatabaseConnection2 connection;

	public DatabaseConnection2() {
		super();
	}
	
	public static DatabaseConnection2 getConnection() {
		return connection;
	}
	

}
