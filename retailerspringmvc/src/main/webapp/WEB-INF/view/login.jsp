<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
<fieldset>
	<legend>Login</legend>
	<form action="./login" method="post">
	Id:<input type="number" name="id">
	Password:<input type="password" name="password">
	<input type="submit" name="login">
	</form>
</fieldset>
<a href="./register">Register Here</a>
</body>
</html>