package com.jspiders.designpatterns.uberfactorydesign;

import java.util.Scanner;

public class UberMain {
	public static void main(String[] args) {

		System.out.println("Welcome To Uber!");
		System.out.println("=============================");
		System.out.println("Enter 1 to book Uber Go");
		System.out.println("Enter 2 to book Auto");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		try {
			uberFactory(choice).booking();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static Vehicle uberFactory(int choice) {
		Vehicle vehicle = null;

		switch (choice) {
		case 1:
			vehicle = new UberGo();
			break;
		case 2:
			vehicle = new Auto();
			break;
		default:
			System.out.println("Invalid Choice!");
		}

		return vehicle;

	}

}
