<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form:form action="processRegistration" method="post" modelAttribute="user">
        <div>
            <label>Name:</label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error-message" />
        </div>
        
        <div>
            <label>Password:</label>
            <form:password path="password" />
            <form:errors path="password" cssClass="error-message" />
        </div>
        
        <div>
            <label>Gender:</label>
            <form:radiobutton path="gender" value="Male" /> Male
            <form:radiobutton path="gender" value="Female" /> Female
            <form:errors path="gender" cssClass="error-message" />
        </div>
        
        <div>
            <label>Address:</label>
            <form:input path="address" />
            <form:errors path="address" cssClass="error-message" />
        </div>
        
        <div>
            <label>Country:</label>
            <form:input path="country" />
            <form:errors path="country" cssClass="error-message" />
        </div>
        
        <div>
            <label>Phone Number:</label>
            <form:input path="phoneNumber" />
            <form:errors path="phoneNumber" cssClass="error-message" />
        </div>
        
        <div>
            <label>Age:</label>
            <form:input path="age" />
            <form:errors path="age" cssClass="error-message" />
        </div>
        
        <div>
            <input type="submit" value="Register">
        </div>
    </form:form>
</body>
</html>
