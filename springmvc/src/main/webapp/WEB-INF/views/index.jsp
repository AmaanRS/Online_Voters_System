<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>

	<h1>This is Amaan's Home Page</h1>
	<br>

	<%

	String name =(String)request.getAttribute("name");
	
	%>
	<h1>Name is <%=name %></h1>
</body>
</html>