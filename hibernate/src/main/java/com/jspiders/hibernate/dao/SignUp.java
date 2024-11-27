package com.jspiders.hibernate.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernate.dto.UserDTO;

public class SignUp {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static Query query;
	
	public static void main(String[] args) {
		openConnection();
		query = entityManager.createQuery("SELECT user FROM UserDTO user WHERE email=?1");
		
//		To get single record use getSingleResult() method 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Email : ");
		String email = scanner.next();
		query.setParameter(1, email );
		try {
			UserDTO email1 = (UserDTO) query.getSingleResult();
			if(email1 != null) {
				query = entityManager.createQuery("SELECT user FROM UserDTO user WHERE password=?1");
				System.out.print("Enter Password : ");
				String password = scanner.next();
				
				query.setParameter(1, password);
				try {
					UserDTO password1 = (UserDTO) query.getSingleResult();
					if(password1 != null) {
						System.out.println("Sign up successfull");
					}
				} catch (Exception e) {
					System.out.println("Invalid Password");
				}
			}
			
		} catch (Exception e) {
			System.out.println("Invalid Email Id");		
			
		}
		scanner.close();
		closeConnection();
		
	}
	
	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	private static void closeConnection() {
		if(entityManagerFactory != null)
			entityManagerFactory.close();
		if(entityManager != null)
			entityManager.close();
		
	}

}
