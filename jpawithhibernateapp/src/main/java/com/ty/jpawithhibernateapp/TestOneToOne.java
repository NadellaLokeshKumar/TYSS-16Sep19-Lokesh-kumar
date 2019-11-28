package com.ty.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.jpawithybernateapp.onetoone.Person;
import com.ty.jpawithybernateapp.onetoone.VoterCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
		
	VoterCard vc = new VoterCard();
	vc.setVid(10);
	vc.setVname("Ram");
	
	Person p = new Person();
	p.setPid(1);
	p.setName("Ram");
	p.setVoterCard(vc);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());
			System.out.println(vCard.getPerson().getName());
			//entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
	}finally {
		entityManager.close();
	}
}
}
