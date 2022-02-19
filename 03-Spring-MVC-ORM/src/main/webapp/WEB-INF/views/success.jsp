<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

	<h1 class="text-center">${Header}</h1>
	
	<h1 style="color: green;">${msg}</h1>
	<hr>
	
	<h1>Welcome, ${u.name}</h1>
	<h2>Your Email is: ${u.email}</h2>
	<h2>Your Password is: ${u.pass}</h2>

</body>
</html>