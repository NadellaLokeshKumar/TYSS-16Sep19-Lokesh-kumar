package com.ty.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();  //if we do the same thing(18-23 lines) in forward, it will not include(not print in result). 
		out.println("<html>");					// This is the only differnce b/w forward and include.
		out.println("<body>");
		out.println("<h1>This is include servlet</h1>");  
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/first");
		dispatcher.include(req, resp);
		
	}
}