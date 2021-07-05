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
COURSE FORM
<table>
<form action="addCourse" method="post">
<tr>
<td>Course Name</td>
<td><input name="name" type="text" /></td>
</tr>
<tr>
<td>Course Description</td>
<td><textArea name="description" type="text" ></textArea></td>
</tr>
<tr>
<td>Course Resources</td>
<td><input name="resource" type="text" /></td>
<td><button type="button"/>UPLOAD</button></td>
</tr>
<tr>
<td>Course Fees</td>
<td><input name="fees" type="text" /></td>
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