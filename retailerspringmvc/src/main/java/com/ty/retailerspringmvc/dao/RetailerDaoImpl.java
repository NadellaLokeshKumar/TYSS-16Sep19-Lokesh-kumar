package com.ty.retailerspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ty.retailerspringmvc.dto.OrderBean;
import com.ty.retailerspringmvc.dto.Product;
import com.ty.retailerspringmvc.dto.RetailerBean;


@Repository
public class RetailerDaoImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public RetailerBean login(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from RetailerBean where id=:id and password=:password";
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
		return null;
	}
}
	@Override
	public int register(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public Product search(int pId) {
		EntityManager manager = factory.createEntityManager();
		Product bean = manager.find(Product.class, pId);
		return bean;
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
			RetailerBean bean = new RetailerBean();
			bean.setPassword(password);
			transaction.commit();

		return true;
	}
	@Override
	public OrderBean amount(int id) {
		
		return null;
	}
	@Override
	public OrderBean orders(int id) {

		return null;
	}

}
