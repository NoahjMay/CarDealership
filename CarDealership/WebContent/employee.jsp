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

  	<link rel="stylesheet" type="text/css" href="styles/employee.css">
  	

<title>Employee</title>
</head>

<body class="p-3 bg-dark text-light">
<br>
	<div class= "container text-center mb-3">
		<form class="bg-dark text-light" action="Logout" method="post">
			<div class="d-flex flex-row justify-content-md-center">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Logout</button>
				</div>	
			</div>
		</form>
	</div>
<br>	
		<div class= "container text-center">
			<form class="bg-dark text-light" action="EmployeeSearchByMakeModel" method="post">

				<div class="d-flex flex-row">
					<div class="col"></div>
					<div class="col">
						<h6>Search New and Used inventory by make and model.</h6>
					</div>
					<div class="col"></div>
				</div>
				
				<div class="d-flex flex-row mb-3">
					<div class="col">
						<input class="form-control" type="text" name="searchMake" id="searchMake"placeholder="Enter Make" required>
					</div>

					<div class="col">
						<input class="form-control" type="text" name="searchModel" id="searchModel" placeholder="Enter Model" required>
					</div>
					
				</div>
				<div class="d-flex flex-row justify-content-md-center">
					<div class="d-flex flex-row w-25">
						<button class="form-control" type="submit">Search</button>
					</div>	
				</div>
			</form>
			<ul class="nav nav-fill">
  				<li class="nav-item">
    				<a class="active text-light" href="employee.jsp">clear search</a>
  				</li>
  			</ul>
		</div>						
<br> 
	<div class= "container text-center">
		<div class="d-flex flex-row ">
			<div class="col"></div>
			<div class="col text-light">
				<button class="btn btn-secondary bg-dark" type="button" data-toggle="collapse" data-target="#collapseNewCars" aria-expanded="false" aria-controls="collapseNewCars">
    				NEW CARS
  				</button>			
			</div>
			<div class="col"></div>	
		</div>	
	</div>

	<div class="collapse" id="collapseNewCars">
	  <div class="card card-body bg-dark">
			<div class="table-responsive">
				<table class="table table-hover table-dark text-light">
					<thead>
						<tr>
							<th scope="col">Make</th>
							<th scope="col">Model</th>
							<th scope="col">Year</th>
							<th scope="col">Trim</th>
							<th scope="col">Color</th>
							<th scope="col">Number Of Doors</th>
							<th scope="col">MPG</th>
							<th scope="col">Vin</th>
							<th scope="col">price</th>
							<th scope="col">Days On Lot</th>
							<th scope="col">bid enabled</th>
						</tr>
	
					</thead>
						<tbody>
							<c:forEach var="newCar" items="${newCars}">
								<tr>
									<td><c:out value="${newCar.make}" /></td>
									<td><c:out value="${newCar.model}" /></td>
									<td><c:out value="${newCar.year}" /></td>
									<td><c:out value="${newCar.trim}" /></td>
									<td><c:out value="${newCar.color}" /></td>
									<td><c:out value="${newCar.doors}" /></td>
									<td><c:out value="${newCar.mpg}" /></td>
									<td><c:out value="${newCar.vin}" /></td>
									<td><c:out value="${newCar.price}" /></td>
									<td><c:out value="${newCar.daysOnLot}" /></td>
									<td><c:out value="${newCar.isBidable()}" /></td>
								</tr>
							</c:forEach>
						</tbody>
				</table>
			</div>
	  
	  </div>
	</div>
<br> 
	<div class= "container text-center">
		<div class="d-flex flex-row ">
			<div class="col"></div>
			<div class="col text-light">
				<button class="btn btn-secondary bg-dark" type="button" data-toggle="collapse" data-target="#collapseUsedCars" aria-expanded="false" aria-controls="collapseUsedCars">
    				USED CARS
  				</button>			
			</div>
			<div class="col"></div>	
		</div>	
	</div>
	
	<div class="collapse" id="collapseUsedCars">
	  <div class="card card-body bg-dark">
			<div class="table-responsive">
				<table class="table table-hover table-dark text-light">
					<thead>
						<tr>
							<th scope="col">Make</th>
							<th scope="col">Model</th>
							<th scope="col">Year</th>
							<th scope="col">Trim</th>
							<th scope="col">Color</th>
							<th scope="col">Number Of Doors</th>
							<th scope="col">MPG</th>
							<th scope="col">Vin</th>
							<th scope="col">price</th>
							<th scope="col">Days On Lot</th>
							<th scope="col">bid enabled</th>
						</tr>
	
					</thead>
						<tbody>
							<c:forEach var="usedCar" items="${usedCars}">
								<tr>
									<td><c:out value="${usedCar.make}" /></td>
									<td><c:out value="${usedCar.model}" /></td>
									<td><c:out value="${usedCar.year}" /></td>
									<td><c:out value="${usedCar.trim}" /></td>
									<td><c:out value="${usedCar.color}" /></td>
									<td><c:out value="${usedCar.doors}" /></td>
									<td><c:out value="${usedCar.mpg}" /></td>
									<td><c:out value="${usedCar.vin}" /></td>
									<td><c:out value="${usedCar.price}" /></td>
									<td><c:out value="${usedCar.daysOnLot}" /></td>
									<td><c:out value="${usedCar.isBidable()}" /></td>
								</tr>
							</c:forEach>
		
						</tbody>
				</table>
			</div>
	  
	  </div>
	</div>
<br> 
	<div class= "container text-center">
		<form class="bg-dark text-light" action="AddCar" method="post">
	
			<div class="d-flex flex-row mb-1">
				<div class="col"></div>
				<div class="col">
					<h5>Add a vehicle to the New or Used inventory</h5>
				</div>
				<div class="col"></div>
			</div>
			<div class="d-flex flex-row mb-3 text-light">
	
				<div class="col">
					<label for="make">Select Manufacturer</label> <select
						class="form-control" name="make" style="color: black;" required>
						<c:forEach var="manufacturer" items="${manufacturers}">
							<option value="${manufacturer}">
								<c:out value="${manufacturer}" />
							</option>
						</c:forEach>
					</select>	
				</div>
	
				<div class="col">
					<label for="bidable">Should Bids be Accepted?</label> <select
						class="form-control" name="bidable" style="color: black;" required>
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>
	
				<div class="col">
					<label for="isNew">New Or Used?</label> <select class="form-control"
						name="isNew" style="color: black;" required>
						<option value="true">New</option>
						<option value="false">Used</option>
					</select>
				</div>
	
			</div>

			<div class="d-flex flex-row mb-3">
	
				<div class="col">
					<input class="form-control" type="text" name="model" placeholder="Model" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="trim" placeholder="Trim" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="color" placeholder="Color"  required>
				</div>
			</div>
	
			<div class="d-flex flex-row mb-3">
	
				<div class="col">
					<input class="form-control" type="number" name="mpg" id="mpg" placeholder="MPG" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="vin" id="vin" placeholder="Vin"required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="miles" placeholder="Miles" required>
				</div>
	
			</div>
	
			<div class="d-flex flex-row mb-3">
	
				<div class="col">
					<input class="form-control" type="text" name="price" placeholder="price" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="daysOnLot" placeholder="Days On Lot" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="year" placeholder="Year" required>
				</div>
	
			</div>
	
			<div class="d-flex flex-row mb-3">
	
				<div class="col">
					<input class="form-control" type="text" name="doors" placeholder="Number Of Doors" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="image" placeholder="Image" required>
				</div>
	
				<div class="col">
					<input class="form-control" type="text" name="description" placeholder="Description" required>
				</div>
	
			</div>
			<div class="d-flex flex-row">
				<div class="col"></div>
				<div class="col">
					<button class="form-control " type="submit">Add Car</button>
				</div>
				<div class="col"></div>
			</div>
		</form>
	</div>
<br>
	<div class= "container text-center">
		<form class="bg-dark" action="BidUpdate" method="post">
			<div class="d-flex flex-row">
				<div class="col"></div>
				<div class="col ">
					<h5>Enable or disable bidding on a new or used vehicle</h5>
				</div>
				<div class="col"></div>
			</div>
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<label for="bidableVin">Enter the vin of the vehicle you want to update</label> 
					<input class="form-control" type="text"name="bidableVin" placeholder="vin" required>
				</div>
	
				<div class="col">
					<label for="bidToggle">Can a bid be placed?</label> 
					<select class="form-control" name="bidToggle" required>
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>
			</div>
			<div class="d-flex flex-row justify-content-md-center mb-3">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Confirm</button>
				</div>	
			</div>
		</form>
	</div>
<br> 
	<div class= "container text-center">
		<div class="d-flex flex-row">
			<div class="col"></div>
			<div class="col text-light">
				<button class="btn btn-secondary bg-dark" type="button" data-toggle="collapse" data-target="#collapseOfferCars" aria-expanded="false" aria-controls="collapseOfferCars">
    				CARS ON OFFER
  				</button>			
			</div>
			<div class="col"></div>	
		</div>	
	</div>

	<div class="collapse" id="collapseOfferCars">
	  <div class="card card-body bg-dark">
			<div class="table-responsive">
				<table class="table table-hover table-dark text-light">
					<thead>
						<tr>
							<th scope="col">First name</th>
							<th scope="col">Last name</th>
							<th scope="col">Email</th>
							<th scope="col">Phone</th>
							<th scope="col">Offer</th>
							
							<th scope="col">Make</th>
							<th scope="col">Model</th>
							<th scope="col">Year</th>
							<th scope="col">Trim</th>
							<th scope="col">Color</th>
							<th scope="col">Vin</th>
							<th scope="col">list price</th>
							<th scope="col">bid enabled</th>
						</tr>
	
					</thead>
						<tbody>
							<c:forEach var="carOffer" items="${carOffers}">
								<tr>
									<td><c:out value="${carOffer.customer.firstNameCustomer}" /></td>
									<td><c:out value="${carOffer.customer.lastNameCustomer}" /></td>
									<td><c:out value="${carOffer.customer.emailCustomer}" /></td>
									<td><c:out value="${carOffer.customer.phoneCustomer}" /></td>
									<td><c:out value="${carOffer.getOfferPrice()}" /></td>
									
									<td><c:out value="${carOffer.customerCarOffer.make}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.model}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.year}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.trim}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.color}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.vin}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.price}" /></td>
									<td><c:out value="${carOffer.customerCarOffer.isBidable()}" /></td>
								</tr>
							</c:forEach>
						</tbody>
				</table>
			</div>
	  
	  </div>
	</div>
<br>	
	<div class= "container text-center">
		<form class="bg-dark text-light" action="EmployeeCarOffer" method="post">

			<div class="d-flex flex-row mb-1">
				<div class="col"></div>
				<div class="col">
					<h5>Accept an offer on a Car</h5>
				</div>
				<div class="col"></div>
			</div>
				
			<div class="d-flex flex-row mb-3">
				<div class="col">
					<label for="offerVin">Enter the vin of the vehicle you want to update</label> 
					<input class="form-control" type="text" name="offerVin" id="offerVin" placeholder="vin" required>
				</div>

				<div class="col">
					<label for="offerYesNo">Accept Offer?</label> 
					<select class="form-control" name="offerYesNo" id="offerYesNo"required>
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>		
			</div>
			<div class="d-flex flex-row justify-content-md-center mb-3">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Confirm</button>
				</div>	
			</div>	
		</form>
	</div>	
<br>
	<div class= "container text-center">
		<div class="d-flex flex-row">
			<div class="col"></div>
			<div class="col text-light">
				<button class="btn btn-secondary bg-dark" type="button" data-toggle="collapse" data-target="#collapseSoldCars" aria-expanded="false" aria-controls="collapseSoldCars">
    				SOLD CARS
  				</button>			
			</div>
			<div class="col"></div>	
		</div>	
	</div>

	<div class="collapse" id="collapseSoldCars">
	  <div class="card card-body bg-dark">
			<div class="table-responsive">
				<table class="table table-hover table-dark text-light">
					<thead>
						<tr>
							<th scope="col">First name</th>
							<th scope="col">Last name</th>
							<th scope="col">Email</th>
							<th scope="col">Phone</th>
							<th scope="col">Offer</th>
							
							<th scope="col">Make</th>
							<th scope="col">Model</th>
							<th scope="col">Year</th>
							<th scope="col">Trim</th>
							<th scope="col">Color</th>
							<th scope="col">Vin</th>
							<th scope="col">list price</th>
							<th scope="col">bid enabled</th>
						</tr>
	
					</thead>
						<tbody>
							<c:forEach var="soldCar" items="${soldCars}">
								<tr>
									<td><c:out value="${soldCar.customer.firstNameCustomer}" /></td>
									<td><c:out value="${soldCar.customer.lastNameCustomer}" /></td>
									<td><c:out value="${soldCar.customer.emailCustomer}" /></td>
									<td><c:out value="${soldCar.customer.phoneCustomer}" /></td>
									<td><c:out value="${soldCar.getOfferPrice()}" /></td>
									
									<td><c:out value="${soldCar.customerCarOffer.make}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.model}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.year}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.trim}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.color}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.vin}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.price}" /></td>
									<td><c:out value="${soldCar.customerCarOffer.isBidable()}" /></td>
								</tr>
							</c:forEach>
						</tbody>
				</table>
			</div>
	  </div>
	</div>
<br>
	<div class= "container">
		<form class="bg-dark text-light" action="EmployeeBusinessReport" method="post">
			<div class="d-flex flex-row text-center text-light">
				<div class="col">
					<p>Display new sales<p>
				</div>
				<div class="col">
					<p>Display used sales<p>
				</div>
			</div>	
			<div class="d-flex flex-row mb-3">
				<div class="col"> 
					<select class="form-control" name="displayNewCarSales" id="displayNewCarSales">
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>
				<div class="col">
					<select class="form-control" name="displayUsedCarSales" id="displayUsedCarSales">
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>
			</div>		
			<div class="d-flex flex-row justify-content-md-center">
				<div class="d-flex flex-row w-25">
					<button class="form-control" type="submit">Generate Report</button>
				</div>	
			</div>
		</form>
	</div>	
<br>	
<br>		
	<div class= "container text-center">
		<div class="d-flex flex-row ">
			<div class="col"></div>
			<div class="col text-light">
				<button class="btn btn-secondary bg-dark" type="button" data-toggle="collapse" data-target="#collapseReport" aria-expanded="false" aria-controls="collapseReport">
    				Business Report
  				</button>			
			</div>
			<div class="col"></div>	
		</div>	
	</div>
	
	<div class="collapse" id="collapseReport">
	  	<div class="card card-body bg-dark">
			<div class="table-responsive">
				<table class="table table-hover table-dark text-light">
					<thead>			
						<tr>
							<c:out value="${businessReportTitle}" />
							<c:out value="${listPriceString} ${listPriceTotal}" />
							<c:out value="${soldPriceString} ${soldPriceTotal}" />
						</tr>
						<tr>
							<th scope="col">First name</th>
							<th scope="col">Last name</th>
							<th scope="col">Email</th>
							<th scope="col">Phone</th>
							<th scope="col">Offer</th>
							
							<th scope="col">Make</th>
							<th scope="col">Model</th>
							<th scope="col">Year</th>
							<th scope="col">Trim</th>
							<th scope="col">Color</th>
							<th scope="col">Vin</th>
							<th scope="col">list price</th>
							<th scope="col">bid enabled</th>
						</tr>
					</thead>
						<tbody>
							<c:forEach var="report" items="${businessReport}">
								<tr>
									<td><c:out value="${report.customer.firstNameCustomer}" /></td>
									<td><c:out value="${report.customer.lastNameCustomer}" /></td>
									<td><c:out value="${report.customer.emailCustomer}" /></td>
									<td><c:out value="${report.customer.phoneCustomer}" /></td>
									<td><c:out value="${report.getOfferPrice()}" /></td>
									
									<td><c:out value="${report.customerCarOffer.make}" /></td>
									<td><c:out value="${report.customerCarOffer.model}" /></td>
									<td><c:out value="${report.customerCarOffer.year}" /></td>
									<td><c:out value="${report.customerCarOffer.trim}" /></td>
									<td><c:out value="${report.customerCarOffer.color}" /></td>
									<td><c:out value="${report.customerCarOffer.vin}" /></td>
									<td><c:out value="${report.customerCarOffer.price}" /></td>
									<td><c:out value="${report.customerCarOffer.isBidable()}" /></td>
								</tr>
							</c:forEach>
						</tbody>
				</table>
			</div>
	  	</div>
	</div>
<br>
<br>
<br>
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