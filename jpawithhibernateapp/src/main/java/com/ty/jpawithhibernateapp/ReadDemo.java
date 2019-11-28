package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 101);		// for select Query.
		System.out.println("ID is: "+productDetail.getPid());
		System.out.println("Name is: "+productDetail.getPname());
		System.out.println("Quantity is: "+productDetail.getQuantity());
		entityManager.close();
	}//end of main method.
}//end of class.
