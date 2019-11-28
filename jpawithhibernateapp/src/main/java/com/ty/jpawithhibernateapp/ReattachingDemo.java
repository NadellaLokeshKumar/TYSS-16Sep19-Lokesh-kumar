package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 101);
			System.out.println(entityManager.contains(product));  // it returns true or false.
			entityManager.detach(product);   // detach only one object.
			System.out.println(entityManager.contains(product));
			Product product2 = entityManager.merge(product); // reattach the object.
			product2.setPname("Pen");
			System.out.println("Record Updated");
			entityTransaction.commit();
			// entityManager.clear();    it will detach all the objects.
			
		}catch(Exception e){
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
