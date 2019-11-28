package com.ty.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.manytomany.Course;
import com.ty.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCnmae("Java");
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCnmae("SQL");
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCnmae("JDBC");
		
		ArrayList<Course> li = new ArrayList();
		li.add(c1);
		li.add(c2);
		li.add(c3);
		
		Student s1 = new Student();
		s1.setSid(234);
		s1.setSname("Lokesh");
		s1.setCourses(li);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
	}finally {
		entityManager.close();
	}
		
	}
}
