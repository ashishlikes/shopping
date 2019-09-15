<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

<form action="adminloginservlet" method="get">

<table>

<tr>
<td>User Name</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="pass"></td>
</tr>


<tr>
<td></td>
<td><input type="Submit" value="log In"></td>
</tr>

</table>
</form>
</body>
</html>