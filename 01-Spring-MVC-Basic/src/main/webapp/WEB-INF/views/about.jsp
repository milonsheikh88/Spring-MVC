<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
</head>
<body>

<%
Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
List<String> friends=(List<String>)request.getAttribute("fr");

%>

<h1>This is about page</h1>
<h1>Called by HomeController</h1>
<h1>url /about</h1>

<h2>ID: <%=id %></h2>
<h2>Name: <%=name %></h2>

<h2>Friends:</h2>

<%
for(String s:friends){
%>
	
<h3><%=s %></h3>	
	
<%
}
%>

</body>
</html>