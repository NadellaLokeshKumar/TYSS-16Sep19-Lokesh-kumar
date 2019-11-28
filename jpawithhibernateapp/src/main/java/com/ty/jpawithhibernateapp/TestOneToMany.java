package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithhibernateapp.onetomany.Pencil;
import com.ty.jpawithhibernateapp.onetomany.PencilBox;
import com.ty.jpawithybernateapp.onetoone.VoterCard;

public class TestOneToMany {

	public static void main(String[] args) {
		
		PencilBox peBox = new PencilBox();
		peBox.setBid(2);
		peBox.setBname("Natraj");
		
		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setColor("black");
		pencil.setPencilBox(peBox);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(14);
		pencil1.setColor("pink");
		pencil1.setPencilBox(peBox);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
	}finally {
		entityManager.close();
	}
	}
}
