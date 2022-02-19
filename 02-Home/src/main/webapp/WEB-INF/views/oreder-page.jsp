<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>
	<h1 align="center">MOM'S CAFE</h1>
	<hr>
	<form action="processOder">
	<div align="center"">
		<label for="item_name">Item name: </label> <input type="text"
			name="foodType" placeholder="Food type?" id="item_name">
		<input type="submit" value="Order now">
	</div>
</form>
</body>
</html>