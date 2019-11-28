package com.ty.jspwithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.jpawithhibernateapp.dto.Product;

public class RetriveDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);
		List<Product> list = query.getResultList();
		
		for(Product l : list) {
			System.out.println(l.getPid());
			System.out.println(l.getPname());
			System.out.println(l.getQuantity());
		}*/
		
		
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		for(String product : list) {
			System.out.println(product);
		}
		entityManager.close();
		
	}//end of main method
}//end of class.
