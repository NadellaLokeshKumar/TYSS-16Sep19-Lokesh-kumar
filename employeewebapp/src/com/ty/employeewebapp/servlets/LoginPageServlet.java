package com.ty.employeewebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
				}
		}
		}
		
		out.println("<html>");
		out.println("<form action='./login' method='post' >");
		out.println("Id:<input name='id' value='"+id+"' type='number'> <br>");
		out.println("Password:<input name='password' type='password'><br>");
		out.println("<input type='checkbox' name='rememberme' value='checked'>Remember Me <br>");
		out.println("<input type='reset' value='Reset'><br>");
		out.println("<input type='submit' value='login'><br>");
		out.println("<a href='./register.html'>Register</a>");
		out.println("</form>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
}
