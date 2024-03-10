<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
    <h2>Registration</h2>
    <form:form action="registration" method="post" modelAttribute="user">
        <label>Name:</label>
        <form:input path="name" />
        <form:errors path="name" cssClass="error"/>
        <br>
        <br>

        <label>Password:</label>
        <form:password path="password" />
        <form:errors path="password" cssClass="error"/>
        <br>
        <br>

        <label>Gender:</label>
        <form:radiobutton path="gender" value="male" /> Male
        <form:radiobutton path="gender" value="female" /> Female
        <form:errors path="gender" cssClass="error"/>
        <br>
        <br>

        <label>Hobbies:</label>
        <form:checkbox path="hobbies" value="reading" /> Reading
        <form:checkbox path="hobbies" value="traveling" /> Traveling
        <form:errors path="hobbies" cssClass="error"/>
        <br>
        <br>

        <label>Address:</label>
        <form:input path="address" />
        <form:errors path="address" cssClass="error"/>
        <br>
        <br>

        <label>Country:</label>
        <form:input path="country" />
        <form:errors path="country" cssClass="error"/>
        <br>
        <br>

        <label>Phone Number:</label>
        <form:input path="phoneNumber" />
        <form:errors path="phoneNumber" cssClass="error"/>
        <br>
        <br>

        <label>Age:</label>
        <form:input path="age" />
        <form:errors path="age" cssClass="error"/>
        <br>
        <br>

        <input type="submit" value="Register">
    </form:form>
</body>
</html>
