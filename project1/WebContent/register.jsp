<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register/Sign Up Form</title>
</head>
<body>

<form action="register" method="post">

<a href="login.html">Login</a>

<table>
<tr>
<td>First name:</td>
<td><input type="text" name="firstname"></td>
</tr>

<tr>
<td>Last name:</td>
<td><input type="text" name="lastname"></td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>
<!-- 
<tr>
<td>Gender:</td>
<td><input type="radio" name="gender" value="male">Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
</tr> -->

<tr>
<td></td>
<td><input type="submit" value="Sign up"></td>
</tr>
</table>
</form>


</body>
</html>