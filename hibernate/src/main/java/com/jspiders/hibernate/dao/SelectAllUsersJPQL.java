package com.jspiders.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernate.dto.UserDTO;

public class SelectAllUsersJPQL {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static Query query;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		openConnection();
		
//		JPQL mainly used to create custom queries for custom operations
		query = entityManager.createQuery("SELECT users FROM UserDTO users ");
		
//		To get all records use getResultLst() method then iterate over.
		List<UserDTO> users= query.getResultList();
		if(users.size() > 0) {
			for(UserDTO user : users) {
				System.out.println(user);
			}
		}else {
			System.out.println("User not found");
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
