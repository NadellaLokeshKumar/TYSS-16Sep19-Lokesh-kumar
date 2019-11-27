package com.ty.empapp.dao;

import java.util.List;

import com.ty.empapp.dto.EmployeeBean;

public interface EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData();
	public int insertEmployeeData(EmployeeBean bean2);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
	public EmployeeBean searchEmployeeData(int id);
	
}
