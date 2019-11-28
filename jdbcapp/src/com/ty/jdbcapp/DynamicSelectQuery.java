package com.ty.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class DynamicSelectQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			// step 1--> load the driver.
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			//step 2---> get the connection.
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			//step 3--> Issue SQL Query.
			
			String sql = prop.getProperty("dynamic-select-query");
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			//step 4--->Read the result.
			
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("ID: "+emp_id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("************************");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//step 5---> close all jdbc objects.
			try {
				
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
