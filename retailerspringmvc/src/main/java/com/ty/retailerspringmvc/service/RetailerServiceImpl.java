package com.ty.retailerspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.retailerspringmvc.dao.RetailerDAO;
import com.ty.retailerspringmvc.dto.OrderBean;
import com.ty.retailerspringmvc.dto.Product;
import com.ty.retailerspringmvc.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;
	@Override
	public RetailerBean login(int id, String password) {
	
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public Product search(int pId) {
		// TODO Auto-generated method stub
		return dao.search(pId);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

	@Override
	public OrderBean amount(int id) {
		// TODO Auto-generated method stub
		return dao.amount(id);
	}

	@Override
	public OrderBean orders(int id) {
		// TODO Auto-generated method stub
		return dao.orders(id);
	}

}
