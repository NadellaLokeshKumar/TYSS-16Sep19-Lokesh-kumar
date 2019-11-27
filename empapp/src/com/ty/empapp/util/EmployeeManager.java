package com.ty.empapp.util;

import com.ty.empapp.dao.EmployeeDAO;
import com.ty.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
