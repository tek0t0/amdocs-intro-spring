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
REGISTRATION FORM
<table>
<form action="userRegister" method="post">
<tr>
<td>User ID</td>
<td><input name="user_Id" type="text" /></td>
</tr>
<tr>
<td>Name</td>
<td><input name="name" type="text" /></td>
</tr>
<tr>
<td>Email</td>
<td><input name="email" type="text" /></td>
</tr>
<tr>
<td>Password</td>
<td><input name="password" type="text" /></td>
</tr>
<tr>
<td>Phone</td>
<td><input name="phone_number" type="text" /></td>
</tr>
<tr>
<td>Address</td>
<td><textArea name="address" type="text" ></textArea></td>
</tr>
<tr>
<td>Upload Photo</td>
<td><textArea name="upload_photo" type="text" ></textArea></td>
<td><button type="button"/>UPLOAD</button></td>
</tr>
<tr>
<td>
<button type="submit">REGISTER</button>
</td>
</tr>
</form>
</table>
</body>
</html>