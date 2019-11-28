

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request" />
<body>
	<a href="./home">Home</a>
	<br>
	<a href="./logout">Logout</a>
	<br>
	<h4><%=msg%></h4>
	<form action="./changepassword" method="post">
		New Password:<input name="password" type="password"> <br>
		confirm Password:<input name="confirmpassword" type="password"><br>
		<input type="reset" value="Reset"><br> <input
			type="submit" value="change">
	</form>
</body>
</html>