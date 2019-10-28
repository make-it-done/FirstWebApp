<%@page import="com.rohit.Model.Customer"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 <%@ page isELIgnored="false"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
		<title>Customer Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">
	FirstName : <form:input path="firstName" /><form:errors path="firstName"/>
	<br><br>
	LastName : <form:input path="lastName"/>
	<br><br>
	Age : <form:input path="age"/><form:errors path="age"/>
	<br><br>
	Email : <form:input path="email"/><form:errors path="email"/>
	<br><br>
	CouseCode: <form:input path="courseCode"/><form:errors path="courseCode"/>
	<input type="submit" value="Submit"> 
	</form:form>

</body>
</html>