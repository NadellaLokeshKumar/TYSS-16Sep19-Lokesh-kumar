package com.ty.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ty.jpawithhibernateapp2.dto.ProductInfo;

public class InsertDemo {

public static void main(String[] args) {
		
		ProductInfo	product = new ProductInfo();
		product.setPid(102);
		product.setPname("Pencil");
		product.setQuantity(20);
		
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
}
