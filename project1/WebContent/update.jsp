<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
</head>
<body>

<form action="updatedeleteservlet" method= "post"> 
<table>

<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>First name:</td>
<td><input type="text" name="firstname"></td>
</tr>

<tr>
<td>Last name:</td>
<td><input type="text" name="lastname"></td>
</tr>


<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="update"></td>
</tr>

</table>
</form>
</body>
</html>