package com.ty.jspwithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
public static void main(String[] args) {
	
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	String jpql = "delete from Product where pname='pencil'";
	Query query = entityManager.createQuery(jpql);
			int res = query.executeUpdate(); 
			System.out.println(res);
			entityTransaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	finally {
		entityManager.close();
	}
	
}
}