package com.jspiders.designpatterns.singleton;

public class DatabaseMain {
public static void main(String[] args) {
	
	DatabaseConnection1 databaseConnection1 = new DatabaseConnection1().getConnection();
	System.out.println(databaseConnection1);
	
	DatabaseConnection2 databaseConnection2 = new DatabaseConnection2().getConnection();
	System.out.println(databaseConnection2);
}

}
 