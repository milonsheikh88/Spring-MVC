<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>  
<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>

<h1>This is help page</h1>
<h1>Called by HomeController</h1>
<h1>url /help</h1>
<h1>Time: ${time}</h1>
<h2>ID: ${id}</h2>
<h2>Name: ${name}</h2>
<hr>
<h2>Friends:</h2>
<hr>
<c:forEach var="item" items="${fr}">
<h4>${item}</h4>
</c:forEach>
</body>
</html>