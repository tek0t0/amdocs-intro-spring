<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="userRegister">Register</a>
<a href="addContact">Contact</a>
<a href="addFeedback">Feedback</a>
<a href="addCourse">Course</a>
<br>
<br>
CONTACT FORM
<table>
<form action="addContact" method="post">
<tr>
<td>USER ID</td>
<td><input name="user_id" type="text" /></td>
</tr>
<tr>
<td>NAME</td>
<td><input name="name" type="text" /></td>
</tr>
<tr>
<td>EMAIL</td>
<td><input name="email" type="text" /></td>
</tr>
<tr>
<td>PHONE NUMBER</td>
<td><input name="phone_number" type="text" /></td>
</tr>
<tr>
<td>MESSAGE</td>
<td><textArea name="message" type="text" ></textArea></td>
</tr>
<tr>
<td>
<button type="submit">SUBMIT</button>
</td>
</tr>
</form>
</table>
</body>
</html>