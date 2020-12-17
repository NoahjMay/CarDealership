<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/login.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>CarDealership</title>
</head>
<body>

	<form action="Login" method="post">

		<div class="container">

			<label for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter email" name="email" required> <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>
			<button type="submit">Login</button>

		</div>
	</form>
	


</body>
</html>