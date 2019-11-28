package com.ty.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		int id = Integer.parseInt(req.getParameter("id"));
		PrintWriter out = resp.getWriter();
		
		
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String query="select * from employee_info where id=?";
			pstmt=conn.prepareStatement(query);
			
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				int eid=rs.getInt("id");
				String ename=rs.getString("name");
				int salary=rs.getInt("sal");
				String gender=rs.getString("gender");
				
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>");
				out.println(eid);
				out.println("</td>");
				out.println("<td>");
				out.println(ename);
				out.println("</td>");
				out.println("<td>");
				out.println(salary);
				out.println("</td>");
				out.println("<td>");
				out.println(gender);
				out.println("</td>");
				out.println("</tr>");
				
			}else {
				out.println("No results found");
			}
		}catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
}
