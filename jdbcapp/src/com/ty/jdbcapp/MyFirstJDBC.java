package com.ty.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {


	// step-1  ----> load the driver.
			
			Driver driver = new Driver();			
			DriverManager.registerDriver(driver);		//instead of 23,24 lines we can use below line(26).
			
		//	Class.forName("com.mysql.jdbc.Driver");		//if we use this, we have to give Exception in catch instead of SQLException.

	// step-2 ---->  Get the connection.

			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");  // getconnection method is also called as factory method which returns the Connection type. 
																	//it is also an example for method overloading.

	// step-3  ---->Issue SQL query.

			String sql = "select * from employee_info";
			stmt = conn.createStatement();				// return type is Statement.
			rs = stmt.executeQuery(sql);				// return type is ResultSet.
			
				
	//step-4 ----> Read the result.
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("****************");
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			
	//step-5 ----> close all JDBC objects.		
			
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
