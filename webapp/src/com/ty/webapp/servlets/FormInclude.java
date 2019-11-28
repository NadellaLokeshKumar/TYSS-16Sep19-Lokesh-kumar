package com.ty.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormInclude extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color: Red'>This is include servlet</h1>");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/form");
		dispatcher.include(req, resp);
		
	}
}