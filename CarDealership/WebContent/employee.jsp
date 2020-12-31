<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/LoadCars" />

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" >


<meta charset="ISO-8859-1">
<title>Employee</title>
</head>

<body class="p-3 mb-2 bg-secondary text-muted">





	<br>

	<form class="form-control btn btn-dark " action="AddCar" method="post"
		style="color: white;">

		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<h4>Add a vehicle to the lot</h4>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
		<div class="row mb-3 " style="color: white;">

			<div class="col-md-4 themed-grid-col">
				<label for="make">Select Manufacturer</label> <select
					class="form-control" name="make" style="color: black;" required>
					<c:forEach var="manufacturer" items="${manufacturers}">
						<option value="${manufacturer}">
							<c:out value="${manufacturer}" />
						</option>
					</c:forEach>
				</select>	
			</div>

			<div class="col-md-4 themed-grid-col">
				<label for="bidable">Should Bids be Accepted?</label> <select
					class="form-control" name="bidable" style="color: black;" required>
					<option value="true">YES</option>
					<option value="false">NO</option>
				</select>
			</div>

			<div class="col-md-4 themed-grid-col">
				<label for="isNew">New Or Used?</label> <select class="form-control"
					name="isNew" style="color: black;" required>
					<option value="true">New</option>
					<option value="false">Used</option>
				</select>
			</div>

		</div>


		<div class="row mb-3">

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="model"
					placeholder="Model" style="color: black;" required>
			</div>




			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="trim"
					placeholder="Trim" style="color: black;" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="color"
					placeholder="Color" style="color: black;" required>
			</div>

		</div>

		<div class="row mb-3">

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="number" name="mpg" id="mpg"
					placeholder="MPG" style="color: black;" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="vin" id="vin"
					placeholder="Vin" style="color: black;" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="miles"
					placeholder="Miles" style="color: black;" required>
			</div>

		</div>

		<div class="row mb-3">

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="price"
					placeholder="price" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="daysOnLot"
					placeholder="Days On Lot" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="year"
					placeholder="Year" required>
			</div>

		</div>

		<div class="row mb-3">

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="doors"
					placeholder="Number Of Doors" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="image"
					placeholder="Image" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<input class="form-control" type="text" name="description"
					placeholder="Description" required>
			</div>

		</div>
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<button class="form-control " type="submit">Add Car</button>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
	</form>

	<br>
	<br>


	<form class="form-control btn btn-dark" action="BidUpdate"
		method="post">
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col"></div>
			<div class="col-md-4 themed-grid-col">
				<h5>Form to enable or disable bidding on a vehicle</h5>
			</div>
			<div class="col-md-4 themed-grid-col"></div>
		</div>
		<div class="row mb-3">
			<div class="col-md-4 themed-grid-col">
				<label for="bidableVin">Enter the vin of the vehicle you
					want to update</label> <input class="form-control" type="text"
					name="bidableVin" placeholder="vin" required>
			</div>

			<div class="col-md-4 themed-grid-col">
				<label for="bidToggle">Can a bid be placed?</label> <select
					class="form-control" name="bidToggle" required>
					<option value="true">YES</option>
					<option value="false">NO</option>
				</select>
			</div>

			<div class="col-md-4 themed-grid-col">
				<label>Set bid ability</label>
				<button class="form-control" type="submit">Submit</button>
			</div>
		</div>
	</form>
	<br>
	<br>
	<div>

		<div>
			<form class="form-control btn btn-dark"
				action="EmployeeSearchByMakeModel" method="post">

				<div class="row mb-3">
					<div class="col-md-4 themed-grid-col"></div>
					<div class="col-md-4 themed-grid-col">
						<h5>Search by make and model</h5>
					</div>
					<div class="col-md-4 themed-grid-col"></div>
				</div>
				<div class="row mb-3">

					<div class="col-md-4 themed-grid-col">
						<label for="searchMake"> </label> <input class="form-control"
							type="text" name="searchMake" id="searchMake"
							placeholder="Enter Make" style="color: black;" required>

					</div>

					<div class="col-md-4 themed-grid-col">
						<label for="searchModel"> </label> <input class="form-control"
							type="text" name="searchModel" id="searchModel"
							placeholder="Enter Model" style="color: black;" required>

					</div>

					<div class="col-md-4 themed-grid-col">
						<label></label>
						<button class="form-control" type="submit">Search</button>
					</div>
				</div>
			</form>

			<form class="form-control btn btn-dark" action="EmployeeClearSearch"
				method="get">
				<div class="row mb-3">
					<div class="col-md-4 themed-grid-col"></div>
					<div class="col-md-4 themed-grid-col">
						<label>clear search</label>
						<button class="form-control" type="submit">clear</button>
					</div>
					<div class="col-md-4 themed-grid-col"></div>
				</div>
			</form>

			<br> <br>

			<table class="table table-hover table-dark" style="color: white;">
				<thead>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th scope="col">NEW CARS</th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
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
				<c:if test="${newCars != null}">
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
				</c:if>
			</table>

		</div>
	</div>

	<div>
		<table class="table table-hover table-dark" style="color: white;">
			<thead>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th scope="col">USED CARS</th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th scope="col">Make</th>
					<th scope="col">Model</th>
					<th scope="col">Year</th>
					<th scope="col">Trim</th>
					<th scope="col">Color</th>
					<th scope="col">Number Of Doors</th>
					<th scope="col">MPG</th>
					<th scope="col">Vin</th>
					<th scope="col">Price</th>
					<th scope="col">Days On Lot</th>
					<th scope="col">bid enabled</th>
				</tr>

			</thead>
			<c:if test="${usedCars != null}">
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
			</c:if>
		</table>
	</div>
	
	<table class="table table-hover table-dark" style="color: white;">
				<thead>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th scope="col">OFFER CARS</th>
						<th></th>	
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
					<tr>
						<th scope="col">First name</th>
						<th scope="col">Last name</th>
						<th scope="col">Email</th>
						
						<th scope="col">Make</th>
						<th scope="col">Model</th>
						<th scope="col">Year</th>
						<th scope="col">Trim</th>
						<th scope="col">Color</th>
						<th scope="col">Vin</th>
						<th scope="col">price</th>
						<th scope="col">bid enabled</th>
					</tr>

				</thead>
				<c:if test="${soldCars != null}">
					<tbody>
						<c:forEach var="offerCar" items="${offerCars}">
							<tr>
								<td><c:out value="${offerCar.price}" /></td>
								<td><c:out value="${offerCar.price}" /></td>
								<td><c:out value="${offerCar.price}" /></td>
								<td><c:out value="${offerCar.make}" /></td>
								<td><c:out value="${offerCar.model}" /></td>
								<td><c:out value="${offerCar.year}" /></td>
								<td><c:out value="${offerCar.trim}" /></td>
								<td><c:out value="${offerCar.color}" /></td>
								<td><c:out value="${offerCar.mpg}" /></td>
								<td><c:out value="${offerCar.vin}" /></td>
								<td><c:out value="${offerCar.price}" /></td>
								<td><c:out value="${offerCar.isBidable()}" /></td>
							</tr>
						</c:forEach>

					</tbody>
				</c:if>
			</table>
			
			<table class="table table-hover table-dark" style="color: white;">
				<thead>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th scope="col">SOLD CARS</th>
						<th></th>	
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
					<tr>
						<th scope="col">First name</th>
						<th scope="col">Last name</th>
						<th scope="col">Email</th>
						
						<th scope="col">Make</th>
						<th scope="col">Model</th>
						<th scope="col">Year</th>
						<th scope="col">Trim</th>
						<th scope="col">Color</th>
						<th scope="col">Vin</th>
						<th scope="col">price</th>
						<th scope="col">bid enabled</th>
					</tr>

				</thead>
				<c:if test="${soldCars != null}">
					<tbody>
						<c:forEach var="soldCar" items="${soldCars}">
							<tr>
								<td><c:out value="${soldCar.price}" /></td>
								<td><c:out value="${soldCar.price}" /></td>
								<td><c:out value="${soldCar.price}" /></td>
								<td><c:out value="${soldCar.make}" /></td>
								<td><c:out value="${soldCar.model}" /></td>
								<td><c:out value="${soldCar.year}" /></td>
								<td><c:out value="${soldCar.trim}" /></td>
								<td><c:out value="${soldCar.color}" /></td>
								<td><c:out value="${soldCar.mpg}" /></td>
								<td><c:out value="${soldCar.vin}" /></td>
								<td><c:out value="${soldCar.price}" /></td>
								<td><c:out value="${soldCar.isBidable()}" /></td>
							</tr>
						</c:forEach>

					</tbody>
				</c:if>
			</table>
</body>

</html>