<%@page import="com.rohit.Model.Student"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 <%@ page isELIgnored="false"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
		<title>Student Form</title>
</head>
<body>

<p><c:out value="${student.toString()}" /> </p>
	<form:form action="processForm" modelAttribute="student">
	FirstName : <form:input path="firstName" />
	<br><br>
	LastName : <form:input path="lastName"/>
	<br><br>
	<%-- 
	<form:select path="country"/>
	<form:option value="Br" label="Brazil" />
	<form:option value="In" label="India" />
	<form:option value="Us" label="United State of America" />
	<form:option value="UK" label="United Kingdom" />
	
	--%>
	
	<form:select path="country">
	<form:option value="None" label="select"/>
	<form:options items="${student.countryList}"/>
	</form:select>
	<br><br>
	
	<form:radiobutton path="course" value="Java" label="Java" />
	<form:radiobutton path="course" value="Cpp" label="Cpp" checked="checked"/>
	<form:radiobuttons path="course" items="${student.courseList}"/>
	<input type="submit" value="Submit"> 
	</form:form>

</body>
</html>