<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>


	<h1>This is the help Page</h1>

	<%
	String nn = (String) request.getAttribute("name");
	%>

	<h2>
		Name is
		<%=nn%></h2>

	<h1>My name is ${name}</h1>

</body>
</html>