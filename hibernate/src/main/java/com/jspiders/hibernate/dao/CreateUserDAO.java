package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.UserDTO;

public class CreateUserDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setName("Ram");
		userDTO.setEmail("ram@gmail.com");
		userDTO.setMobile(9876543212l);
		userDTO.setPassword("Ram@1234");

		openConnection();
		entityTransaction.begin();
		entityManager.persist(userDTO); // persist() method is used to insert data
		entityTransaction.commit();
		closeConnection();
		
	}

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if(entityManagerFactory != null)
			entityManagerFactory.close();
		if(entityManager != null) 
			entityManager.close();
		if(entityTransaction != null)
			if(entityTransaction.isActive())
				entityTransaction.rollback();
			
	}
}
