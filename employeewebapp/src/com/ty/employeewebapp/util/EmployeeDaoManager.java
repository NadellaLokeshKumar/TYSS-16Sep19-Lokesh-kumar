package com.ty.employeewebapp.util;

import com.ty.employeewebapp.dao.EmployeeDAO;
import com.ty.employeewebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
