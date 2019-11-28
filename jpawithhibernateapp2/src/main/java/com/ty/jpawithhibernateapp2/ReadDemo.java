package com.ty.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp2.dto.ProductInfo;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productDetail = entityManager.find(ProductInfo.class, 102);		// for select Query.
		System.out.println("ID is: "+productDetail.getPid());
		System.out.println("Name is: "+productDetail.getPname());
		System.out.println("Quantity is: "+productDetail.getQuantity());
		entityManager.close();
	}//end of main method.
}
