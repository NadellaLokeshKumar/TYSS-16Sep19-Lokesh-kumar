<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
<a href="./login">Logout</a>
<fieldset>
<legend>Update</legend>
<form action="./updateprofile" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><input type="text" name="gender"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>DOJ:</td>
			<td><input type="date" name="doj"></td>
		</tr>
		<tr>
		<td><input type="submit" name="Register"></td>
		</tr>
		</table>
		</form>
		
</fieldset>
</body>
</html>