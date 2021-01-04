<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/LoadCars" />

<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="ISO-8859-1">
	
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link rel="stylesheet" 
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
		crossorigin="anonymous">
    	
  	<link rel="stylesheet" type="text/css" href="styles/login.css">


<title>CarDealership</title>
</head>
<body class="p-3 bg-dark text-light ">
	<div class= "container text-center">
		<form class="bg-dark text-light" action="Login" method="post">
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<input class="form-control" type="email" name="email" id="email"placeholder="Enter email" required>
				</div>

				<div class="col">
					<input class="form-control" type="password" name="password" id="password" placeholder="Enter Password" required>
				</div>		
			</div>
			<div class="d-flex flex-row justify-content-md-center">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Login</button>	
				</div>		
			</div>		
		</form>
		<div class="d-flex flex-row  justify-content-md-center p-3 mb-3">
			<a class="active text-light" href="signUp.jsp">Sign Up</a>		
		</div>
	</div>
<br>
<jsp:include page="/newCars.jsp"/>
<br>
<jsp:include page="/usedCars.jsp"/>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" 
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" 
	crossorigin="anonymous">
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" 
	crossorigin="anonymous">
</script>

</body>
</html>