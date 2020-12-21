<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/DisplayCars" />

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/employee.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" type="text/css" href="styles/.css">

<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>

	<div>
		<form class="container" action="AddCars" method="post">
			<div>

				<br> Car Make <select class="form-control" name="make">
					<option value="chevy">Chevy</option>
					<option value="ford">Ford</option>
					<option value="dodge">Dodge</option>
					<option value="impala">Impala</option>
					<option value="mazda">Mazda</option>
				</select>
			</div>

			<div>
				<label for="model"><b>Car Model:</b></label> <input type="text"
					name="model" id="model" placeholder="model" required>
			</div>
			<div>
				<p>
					Year: <input type="date" id="datepicker" name="year">
				</p>
			</div>
			<div>
				<label for="trim"><b>trim:</b></label> <input type="text"
					name="trim" id="trim" placeholder="trim" required>
			</div>
			<div>
				<label for="color"><b>color:</b></label> <input type="text"
					name="color" id="color" placeholder="color" required>
			</div>
			<div>
				<label for="doors"><b>doors:</b></label> <input type="text"
					name="doors" id="doors" placeholder="doors" required>
			</div>
			<div>
				<label for="mpg"><b>MPG:</b></label> <input type="text"
					name="mpg" id="mpg" placeholder="mpg" required>
			</div>
			<div>
				<label for="vin"><b>Vin:</b></label> <input type="text"
					name="vin" id="vin" placeholder="vin" required>
			</div>
			<div>
				<label for="miles"><b>miles:</b></label> <input type="text"
					name="miles" id="miles" placeholder="miles" required>
			</div>
			<div>
				<label for="price"><b>price:</b></label> <input type="text"
					name="price" id="price" placeholder="price" required>
			</div>
			<div>
				<br> New Or Used <select class="form-control" name="isNew">
					<option value="true">New</option>
					<option value="false">Used</option>


				</select>
			</div>
			<button type="submit">Add Car</button>
		</form>

	</div>

	<div>
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
					<th scope="col">Days On Lot</th>
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
							<td><c:out value="${newCar.daysOnLot}" /></td>
						</tr>
					</c:forEach>

				</tbody>
			</c:if>
		</table>
	</div>

	<div>
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
					<th scope="col">Days On Lot</th>
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
							<td><c:out value="${usedCar.daysOnLot}" /></td>
						</tr>
					</c:forEach>

				</tbody>
			</c:if>
		</table>
	</div>
</body>
</html>