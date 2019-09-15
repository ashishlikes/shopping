<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link rel="stylesheet" href="insert.css">
</head>
<body>
<table>

<tr>
<td> Perfume Brand</td>
<td><input type="text" name="perfumebrand"></td>
</tr>

<tr>
<td> Perfume Name</td>
<td><input type="text" name="perfumename"></td>
</tr>

<tr>
<td> Product Description</td>
<td><textarea rows="10" cols="100"> </textarea></td>
</tr>

<tr>
<td> Select size</td>
<td><input type="radio" name="select size" value="100ml">100ml </td>
<td><input type="radio" name="select size" value="75ml">75ml </td>
<td><input type="radio" name="select size" value="50ml">50ml </td>
</tr>

<tr>
<td> Price</td>
<td><input type="text" name="price"></td>
</tr>

<tr>
<td> Image url</td>
<td>
<img src=" "><textarea rows="1" cols="100"></textarea></td>
</tr>

<tr>
<td></td>
<td><input type="Submit" value="Add Product"></td>
</tr>

</table>
</body>
</html>