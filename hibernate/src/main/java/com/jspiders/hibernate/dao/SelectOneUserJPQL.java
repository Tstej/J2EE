package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernate.dto.UserDTO;

public class SelectOneUserJPQL {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static Query query;
	
	public static void main(String[] args) {
		openConnection();
		query = entityManager.createQuery("SELECT user FROM UserDTO user WHERE email=?1");
		
//		To get single record use getSingleResult() method 
		query.setParameter(1, "ram@gmail.com");
		try {
			UserDTO userDTO = (UserDTO) query.getSingleResult();
			if(userDTO != null) {
				System.out.println(userDTO);
			}else {
				System.out.println("User not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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
