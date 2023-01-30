<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function alertName(){
alert("Id or Password is Incorrect");

} 
window.onload = alertName;
</script> 
<meta charset="UTF-8">
<title>Admin Login</title>
    <style>
        input::-webkit-outer-spin-button,
        input::-webkit-inner-spin-button {
            -webkit-appearance: none;
            margin: 0;
        }
  
        input[type=number] {
            -moz-appearance: textfield;
        }
    </style>
</head>
<body>
	<form class="px-4 py-3" action="/adminPage" method="post">
		<div class="form-group">
			<label for="exampleDropdownFormEmail1">Id</label> <input
				type="number" name="adminId" class="form-control"
				id="exampleDropdownFormEmail1" placeholder="Enter Id" required="required">
		</div>
		<div class="form-group">
			<label for="exampleDropdownFormPassword1">Password</label> <input
				type="password" class="form-control"
				id="exampleDropdownFormPassword1" name="adminPassword"
				placeholder="Password" required="required">
		</div>
		<button type="submit" class="btn btn-primary">Sign in</button>
	</form>
</body>
</html>