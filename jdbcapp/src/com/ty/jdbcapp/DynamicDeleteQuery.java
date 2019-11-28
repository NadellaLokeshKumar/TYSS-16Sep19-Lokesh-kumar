package com.ty.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			

			//step 1--->load the driver.

			Class.forName(prop.getProperty("driver-class-name"));
			
			//step 2--->get the connections.
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			//step 3---->Issue SQL query.
			
			String sql = prop.getProperty("dynamic-delete-query");
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
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
