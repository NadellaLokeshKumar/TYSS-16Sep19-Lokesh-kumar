package com.ty.employeewebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.employeewebapp.dto.EmployeeInfo;


@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);   //it just check whether the session object os present or not.
		if(session!=null) {
			EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
			
			/*PrintWriter out = resp.getWriter();
			out.println("<h1>Welcome "+ info.getName());
			out.println("</h1>");
			out.println("<a href='./search.html'>Search</a>");
			out.println("<a href='./changepassword.html'>Change Password</a>");
			out.println("<a href='./logout'>Logout</a>");*/
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req, resp);
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doGet(req, resp);
	}
}
