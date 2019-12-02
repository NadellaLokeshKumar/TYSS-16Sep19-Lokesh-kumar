<%@page import="com.ty.retailerspringmvc.dto.Product"%>
<%@page import="com.ty.retailerspringmvc.dto.OrderBean"%>
<%@page import="com.ty.retailerspringmvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
   RetailerBean bean = (RetailerBean)session.getAttribute("bean");
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Home</legend>
<a href="./changepassword">Change Password</a>
<a href="./logout" style="float:right">Logout</a>
<h3>Welcome to <%=bean.getName() %></h3>
<fieldset>
	<legend>Search for product</legend>
	<form action="./search">
		Id:<input type="number" name="pId">
		<input type="submit" name="Search">
	</form>
</fieldset>
	<%
	Product p = (Product)request.getAttribute("bean");
	%>
<% 
if(p!=null){
%>
<table>
	<tr>
		<th>Id</th>
		<th>productName</th>
		<th>Price</th>
		
	</tr>
	<tr>
		<td><%=p.getpId() %></td>
		<td><%=p.getpName() %></td>
		<td><%=p.getCost() %></td>
		
	</tr>
</table>
<%} %>
<h3>${msg}</h3>
</fieldset>

</body>
</html>