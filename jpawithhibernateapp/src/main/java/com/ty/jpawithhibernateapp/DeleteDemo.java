package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.dto.Product;

public class DeleteDemo {

	public static void main(String[] args) {
			EntityManager entityManager = null;
			EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product productInfo = entityManager.find(Product.class, 102);  // to remove(this line and next line) required.
			entityManager.remove(productInfo);
			System.out.println("Record remove");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}//end of the main method.
}//end of the class.
