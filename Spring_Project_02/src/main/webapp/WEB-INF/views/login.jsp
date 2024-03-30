<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 400px;
	margin: 50px auto;
	padding: 20px;
	background: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	color: #333;
}

.form-group {
	margin-bottom: 20px;
}

label {
	font-weight: bold;
}

input[type="text"], input[type="password"], input[type="submit"] {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #007bff;
	color: #fff;
	border: none;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form:form action="process" method="post" modelAttribute="login">
			<div class="form-group">
				<label for="name">Name:</label>
				<form:input path="name" id="name" />
				<form:errors path="name" cssClass="error-message" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<form:input path="pass" id="password" type="password" />
				<form:errors path="pass" cssClass="error-message" />
			</div>
			<input type="submit" value="Submit">
		</form:form>
		<div style="text-align: center; margin-top: 20px;">
			<a href="register" class="register-btn">Register</a>
		</div>
	</div>
</body>
</html>
