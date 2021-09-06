<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to My first web application From Saraya Tech</h1>
	<p>This is my beautiful wedsite.</p>
	<p><font color="red">${errorMessage }</font></p>
	<form action="login.do" method="post">
		<label>Username:</label>
		<input type="text" name="name">
		<label>Password:</label>
		<input type="password" name="pass">
		<input type="submit">
	</form>
</body>
</html>