<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">

<head>

	<meta charset="ISO-8859-1">
	
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" >

	<link rel="stylesheet" type="text/css" href="styles/customer.css">


<title>Customer</title>
</head>
<body class="form-control btn btn-dark">

	<form class="form-control btn btn-dark" action="Logout" method="post">
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<button class="form-control" type="submit">Logout</button>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
	</form>


	<form class="form-control btn btn-dark" action="CustomerOffer" method="post">
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<h5>Make an offer on a car</h5>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col">
				<input type="text" class="form-control" id="customerOfferPrice"name="customerOfferPrice" placeholder="Place an offer" required>
			</div>
			<div class="col-md-4 themed-grid-col">
				<input type="text" class="form-control" id="customerOfferVin"name="customerOfferVin" placeholder="Vin of car you want to buy" required>
			</div>
			<div class="col-md-4 themed-grid-col">
				<button class="form-control" type="submit">Offer</button>
			</div>
		</div>
	</form>	


	<form class="form-control btn btn-dark" action="CustomerSearchByMakeModel" method="post">
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<h5>Search by make and model</h5>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col">
				<input type="text" class="form-control" id="customerSearchMake"name="customerSearchMake" placeholder="Make" required>
			</div>
			<div class="col-md-4 themed-grid-col">
				<input type="text" class="form-control" id="customerSearchModel"name="customerSearchModel" placeholder="Model">
			</div>
			<div class="col-md-4 themed-grid-col">
				<button class="form-control" type="submit">Search</button>
			</div>
		</div>
	</form>	
	<br>		
	<form class="form-control btn btn-dark" action="CustomerClearSearch" method="get">
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<button class="form-control" type="submit">Clear Search</button>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
	</form>


	<br>	
<br>
<br>
<br>
	
<jsp:include page="/newCars.jsp"/>
<jsp:include page="/usedCars.jsp"/>
		
		
</body>
</html>