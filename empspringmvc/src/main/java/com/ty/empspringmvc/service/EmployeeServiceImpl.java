package com.ty.empspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.empspringmvc.dao.EmployeeDAO;
import com.ty.empspringmvc.dto.EmployeeBean;

@Service      // here we can use @Component also. since it is a service layer, we  are using @Service.
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public int register(EmployeeBean bean) {
		//logic to check email and password.
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
	
		return dao.searchEmployee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
	
		return dao.updateEmployee(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

}
