<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/LoadCars" />

<!DOCTYPE html>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles/employee.css">


<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>

 <div class="flex-container">
  <div>1</div>
  <div>2</div>
  <div>3</div>
</div> 






	<div>
		<form name="addCarform" class="container" action="EmployeeUpdateCars" method="post">
			<div>
				<h4>Add A car to the Inventory</h4>
			</div>
			<div>
				Car Make <select class="form-control" name="make">
					<c:forEach var="manufacturer" items="${manufacturers}">
						<option value="${manufacturer}"><c:out
								value="${manufacturer}" /></option>

					</c:forEach>

				</select>
			</div>

			<div>
				<label for="model"></label> <input type="text" name="model"
					id="model" placeholder="model" required>
			</div>

			<div>
				<label for="trim"></label> <input type="text" name="trim" id="trim"
					placeholder="trim" required>
			</div>
			<div>
				<label for="color"></label> <input type="text" name="color"
					id="color" placeholder="color" required>
			</div>
			<div>
				<label for="doors"></label> <input type="text" name="doors"
					id="doors" placeholder="doors" required>
			</div>
			<div>
				<label for="mpg"></label> <input type="text" name="mpg" id="mpg"
					placeholder="mpg" required>
			</div>
			<div>
				<label for="vin"></label> <input type="text" name="vin" id="vin"
					placeholder="vin" required>
			</div>
			<div>
				<label for="miles"></label> <input type="text" name="miles"
					id="miles" placeholder="miles" required>
			</div>
			<div>
				<label for="price"></label> <input type="text" name="price"
					id="price" placeholder="price" required>
			</div>
			<div>
				<label for="daysOnLot"></label> <input type="text" name="daysOnLot"
					id="daysOnLot" placeholder="daysOnLot" required>
			</div>
			<div>
				<br>Can you bid on it?<select class="form-control"
					name="bidable">
					<option value="true">YES</option>
					<option value="false">NO</option>


				</select>
			</div>
			<div>
				<br> New Or Used <select class="form-control" name="isNew">
					<option value="true">New</option>
					<option value="false">Used</option>


				</select>
			</div>
			<div>
				<input type="date" id="datepicker" name="year">
			</div>
			<div>
				<button type="submit">Add Car</button>
			</div>
		</form>

	</div>

	<div>
		<form class="container" action="EmployeeUpdateCars" method="post">

			<div>
				<label for="bidableVin"><b>input the VIN:</b></label> <input
					type="text" name="bidableVin" id="bidableVin" placeholder="vin"
					required>
			</div>

			<div>
				<br>Set if a bid can be placed<select class="form-control"
					name="bidToggle">
					<option value="true">YES</option>
					<option value="false">NO</option>
				</select>
			</div>

			<div>
				<button type="submit">Toggle Bid enabled</button>
			</div>
		</form>
	</div>
	<div>

		<div style="overflow-x: auto;">
			<table class="table table-hover table-dark" style="color: Tomato;">
				<thead>
					<tr>
						<th scope="col"><h6>New Cars</h6></th>
						<th scope="col"><select class="form-control" name="searchByNewMake">
						<option value="searchByMake">Search By Make</option>
					<c:forEach var="manufacturer" items="${manufacturers}">
						<option value="${manufacturer}"><c:out value="${manufacturer}" /></option>
					</c:forEach>
					
				</select>
				
					<th scope="col"><label for="model"></label> <input type="text" name="model"
					id="model" placeholder="Search by model" required>
							<button type="submit"name = "newSearch">Search</button>
							<button type="submit" name = "newClearSearch">Clear Search</button></th>
					
					</tr>

					
				</thead>
			</table>
			<table class="table table-hover table-dark" style="color: Tomato;">
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

		<table class="table table-hover table-dark" style="color: Tomato;">
			<thead>
				<tr>
					<th scope="col"><h6>Used Cars</h6></th>
					<th scope="col"><label for="searchUsed">Search By: </label> <select
						name="searchUsed" id="searchUsed">
							<option value="usedMake">make</option>
							<option value="usedModel">model</option>
					</select>
						<button type="submit" name = "usedSearch">Search</button>
						<button type="submit" name = "usedClearSearch">Clear Search</button></th>

				</tr>


			</thead>
		</table>
		<table class="table table-hover table-dark" style="color: Tomato;">
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
</body>
</html>