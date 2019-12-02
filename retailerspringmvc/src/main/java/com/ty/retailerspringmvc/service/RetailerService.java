package com.ty.retailerspringmvc.service;

import com.ty.retailerspringmvc.dto.OrderBean;
import com.ty.retailerspringmvc.dto.Product;
import com.ty.retailerspringmvc.dto.RetailerBean;

public interface RetailerService {

	public RetailerBean login(int id, String password);
	public int register(RetailerBean bean);
	public Product search(int pId);
	public boolean changePassword(int id, String password);
	public OrderBean amount(int id);
	public OrderBean orders(int id);
}
