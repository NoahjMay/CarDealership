<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="ISO-8859-1">
	
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link rel="stylesheet" 
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
		crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="styles/customer.css">


<title>Customer</title>
</head>
<body class="p-3 bg-dark text-light">
<br>
	<div class= "container text-center">
		<form class="bg-dark text-light" action="Logout" method="post">
			<div class="d-flex flex-row">
				<div class="col"></div>
				<div class="col">
					<button class="form-control" type="submit">Logout</button>
				</div>
				<div class="col"></div>
			</div>
		</form>
	</div>
<br>	
	<div class= "container text-center">
		<form class="bg-dark text-light" action="CustomerOffer" method="post">
			<div class="d-flex flex-row mb-3">
				<div class="col"></div>
				<div class="col">
					<h5>Make an offer on a car</h5>
				</div>
				<div class="col"></div>
			</div>
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<input type="text" class="form-control" name="customerOfferPrice" id="customerOfferPrice" placeholder="Enter offer Amount" required>
				</div>
				<div class="col">
					<input type="text" class="form-control" name="customerOfferVin" id="customerOfferVin" placeholder="Vin of car you want to buy" required>
				</div>	
			</div>
			<div class="d-flex flex-row justify-content-md-center">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Offer</button>
				</div>	
			</div>
		</form>	
	</div>
<br>
	<div class= "container text-center">
		<form class="bg-dark text-light " action="CustomerSearchByMakeModel" method="post">
			<div class="d-flex flex-row">
				<div class="col"></div>
				<div class="col">
					<h5>Search New and Used inventory <br>by make and model.</h5>
				</div>
				<div class="col"></div>
			</div>
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<input type="text" class="form-control" name="customerSearchMake" id="customerSearchMake" placeholder="Make" required>
				</div>
				<div class="col">
					<input type="text" class="form-control" name="customerSearchModel" id="customerSearchModel" placeholder="Model">
				</div>	
			</div>
			<div class="d-flex flex-row justify-content-md-center">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Search</button>
				</div>	
			</div>
		</form>	
    		<a class="active text-light" href="customer.jsp">clear search</a>
	</div>
<br>	
<jsp:include page="/newCars.jsp"/>
<br>
<jsp:include page="/usedCars.jsp"/>
<br>
		
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