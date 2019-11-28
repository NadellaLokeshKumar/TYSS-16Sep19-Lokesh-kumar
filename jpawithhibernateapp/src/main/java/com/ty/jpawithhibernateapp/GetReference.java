package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {
	
	EntityManager entityManager = null;
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		//Product product = entityManager.getReference(Product.class, 101);
		Product product = entityManager.find(Product.class, 101);
		System.out.println(product.getClass());  // by using find method for this, we get the actual object. 
												// by using getReference for this, we get proxy object.
		/*System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity()); */
	
	entityManager.close();
}
}
