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

  	<link rel="stylesheet" type="text/css" href="styles/signUp.css">
  	
<title>sign up</title>
</head>
<body class="p-3 bg-dark text-light">
	<div class= "container">
		<form class="bg-dark text-light" action="customerSignUp" method="post">

			<div class="d-flex flex-row">
				<div class="col"></div>
				<div class="col text-center">
					<h5>Sign Up</h5>
				</div>
				<div class="col"></div>
			</div>		
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<label for="email"><b>Email</b></label>
					<input class="form-control" type="email" name="signUpEmail" id="signUpEmail" placeholder="Enter Email" required>
				</div>
				<div class="col">
					<label for="email"><b>Password</b></label>
					<input class="form-control" type="password" name="signUpPassword" id="signUpPassword" placeholder="Enter Password" required>
				</div>		
			</div>
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<label for="email"><b>First Name</b></label>
					<input class="form-control" type="text" name="signUpFirstName" id="signUpFirstName" placeholder="Enter first name" required>
				</div>
				<div class="col">
					<label for="email"><b>Last Name</b></label>
					<input class="form-control" type="text" name="signUpLastName" id="signUpLastName" placeholder="Enter last name" required>
				</div>		
			</div>
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<label for="email"><b>phone number</b></label>
					<input class="form-control" type="text" name="phoneCustomer" id="phoneCustomer" placeholder="Enter phone number" required>
				</div>
				<div class="col ">
				<label for="email"><b>Sign Up</b></label>
					<button class="form-control" type="submit">Confirm</button>
				</div>					
			</div>
			<div class="d-flex flex-row justify-content-md-center">
				<p>Already have an account?<p>
			</div>
			<div class="d-flex flex-row justify-content-md-center">
    			<a class="active text-light" href="index.jsp"> Sign in</a>
			</div>
		</form>		
	</div>		  

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