package com.ty.empapp;

import java.util.List;
import java.util.Scanner;

import com.ty.empapp.dao.EmployeeDAO;
import com.ty.empapp.dao.EmployeeDAOImpl;
import com.ty.empapp.dto.EmployeeBean;
import com.ty.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Press 1 to show all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		switch(ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSal());
			}
			
			break;
		case 2:
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			
			int eid = scn.nextInt();
												/*String empid = args[0];
												int eid = Integer.parseInt(empid);*/
			bean2.setId(eid );
			
			
			String name = scn.next();
												/*String name = args[1];*/
			bean2.setName(name);
			
			
			int sal = scn.nextInt();
													/*String esal = args[2];
													int sal = Integer.parseInt(esal);*/
			bean2.setSal(sal);
			
			
			String gender = scn.next();
													/*String gender = args[3];*/
			bean2.setGender(gender);
			 
			
			int count = dao2.insertEmployeeData(bean2);
			System.out.println(count +" rows are inserted");
			
			
			break;
		case 3:
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean3 = new EmployeeBean();
			
			String name3 = scn.next();
			bean3.setName(name3);
			
			int sal3 = scn.nextInt();
			bean3.setSal(sal3);
			
			String gender3 = scn.next();
			bean3.setGender(gender3);
			
			int id3 = scn.nextInt();
			bean3.setId(id3);
			
			int count3 = dao3.updateEmployeeData(bean3);
			System.out.println(count3 +" rows are selected");
			
			break;
		case 4:
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter Employee id: ");
			int id4 = scn.nextInt();
			int count4 = dao4.deleteEmployeeData(id4);
			System.out.println(count4 +" rows are deleted");
			
			break;
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter Employee id: ");
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Salary: "+bean.getSal());
			}else {
				System.out.println("No data found");
			}
			break;
			

		}		
	}

	

	
	

}
