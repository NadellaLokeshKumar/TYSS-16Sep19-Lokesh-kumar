package com.ty.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		Object obj = req.getAttribute("obj");  //it is for request Attribute.
		
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");

		PrintWriter out = resp.getWriter();		//we don't create the object of PrintWriter by using new keyword.
		resp.setContentType("text/html");    //we have to pass type of content in paranthesis. By default it is text/html.
		out.println("<html>");
		out.println("<body>");

		Date date = new Date();
		out.println("<h1 style='color: Red'>Date and Time is:");
		out.println(date.toString());//toString is not mandatory, because implicitly done.
		out.println(obj);		// it is for request Attribute.
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		
		String url = req.getRequestURI();
		String method = req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);

		out.println("</body>");
		out.println("</html>");

	}//end of doGet()

}//end of MyFirstServlet
