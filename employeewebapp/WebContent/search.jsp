<%@page import="com.ty.employeewebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>

<body>
<a href='./home'>Home</a>
<a style='float:right' href='./logout'>Logout</a>

<%if(info!=null){ %>
<table align='center'>
<tr>
<th>Id</th><th>Name</th><th>Email</th>
</tr>
<tr>
<td><%=info.getId()%></td>
<td><%=info.getName()%></td>
<td><%=info.getEmail()%></td>
</tr>
</table>
<%}else{%>
<h1>No data found</h1>
<%}%>

</body>
</html>