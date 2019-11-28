package com.ty.jpawithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicUpdateQuery {
public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//step 1--->load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2--->get the connection.
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3---> Issue SQL query.
			
			String sql = " update employee_info set name = ?, sal=?, gender=? where id=?";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			
			int count = pstmt.executeUpdate();
			
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
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
