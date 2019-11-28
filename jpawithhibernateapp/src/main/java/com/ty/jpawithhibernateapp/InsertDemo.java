package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product	product = new Product();
		product.setPid(103);
		product.setPname("Mobile");
		product.setQuantity(10);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);		// to insert.
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}//end of main method
}//end of class
