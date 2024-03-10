<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form:form action="login" method="post" modelAttribute="LoginDto" >
		<label>Username:</label>
		<form:input path="username" />
		<br>
		<br>

		<label>Password:</label>
		<form:password path="password" />
		<br>
		<br>

		<input type="submit" value="Login">
	</form:form>
</body>
</html>
