<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="register">Register</a>
<a href="addContact">Contact</a>
<a href="addFeedback">Feedback</a>
<a href="addCourse">Course</a>
<br>
<br>
Hello from register
<br>
<table>
<form action="register" method="post">
<tr>
<td>EmpID</td>
<td><input name="empId" type="text" /></td>
</tr>
<tr>
<td>First Name</td>
<td><input name="firstName" type="text" /></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name="lastName" type="text" /></td>
</tr>
<tr>
<td>
<input type="submit">
</td>
</tr>
</form>
</table>
</body>
</html>