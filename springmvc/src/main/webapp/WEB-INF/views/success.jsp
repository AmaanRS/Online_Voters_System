<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<h2>This is Success Page</h2>
	<%-- 
	String email = (String) request.getAttribute("email");
	String name = (String) request.getAttribute("name");
	String password = (String) request.getAttribute("password");
	--%>
	<h1>${user.email}</h1>
	<h1>${user.userName}</h1>
	<h1>${user.password}</h1>



</body>
</html>