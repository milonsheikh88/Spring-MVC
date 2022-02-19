<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process</title>

<style type="text/css">

span{
color: red;
font-family: Arial;
}

</style>

</head>
<body>

	<%
	String m=(String)request.getAttribute("userInput");
	%>
<div align="center"">

<h1>Order Received!</h1>
Your order<span> <%=m%> </span>is getting processed...

</div>

</body>
</html>