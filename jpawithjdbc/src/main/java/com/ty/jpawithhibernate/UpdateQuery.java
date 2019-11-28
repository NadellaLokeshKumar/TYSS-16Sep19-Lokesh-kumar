package com.ty.jpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//step 1--->load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2--->get the connection.
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3---> Issue SQL query.
			
			String sql = " update employee_info set name = 'praneeth', sal=30000, gender='M' where id=22";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4---> Read the result.
			
			System.out.println(count + " Rows are updated");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//step 5--->close all JDBC objects.
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
