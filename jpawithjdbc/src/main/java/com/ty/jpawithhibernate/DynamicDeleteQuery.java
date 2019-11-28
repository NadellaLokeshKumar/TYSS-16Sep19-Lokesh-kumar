package com.ty.jpawithhibernate;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicDeleteQuery {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;


		try {
		
			

			//step 1--->load the driver.

			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2--->get the connections.
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3---->Issue SQL query.
			
			String sql = " delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			

			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			
			//step 4--->Read the result.
			
			System.out.println(count + " Rows are deleted");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//step 5---> close all JDBC objects.
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
