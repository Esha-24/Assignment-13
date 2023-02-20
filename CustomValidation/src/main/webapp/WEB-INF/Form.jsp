<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="userInfo" modelAttribute="emp">
	Organization Name: <form:input path="orgName" required="true" /><br>
	<form:errors path="orgName" cssClass="error" /><br>
	First Name: <form:input path="firstName" required="true" /><br>
	Last Name: <form:input path="lastName" required="true" /><br>
	<input type="submit" value="submit">
</form:form>
</body>
</html>