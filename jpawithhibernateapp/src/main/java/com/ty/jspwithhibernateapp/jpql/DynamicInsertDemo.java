package com.ty.jspwithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertDemo {         //we cann't insert a record with the help of entity class.
	public static void main(String[] args) {
		
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	String jpql = "insert into Product values(:id,:name,:quantity)";
	Query query = entityManager.createQuery(jpql);
		query.setParameter("id", 103);
		query.setParameter("name", "Bike");
		query.setParameter("quantity", 20);
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
