<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
             pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrolled</title>
</head>
<body>
<p>${firstName}</p>
<br><br>
<p>FirstName using request Parameter ${param.firstName }</p>
<br><br>
<p>${lastName}</p>
<br><br>
<p>lastName using request Parameter ${param.lastName }</p>
<br><br>
</body>
</html>