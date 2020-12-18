<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/displayCars.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
</head>
<body>

		<table id="cars">
			<thead>
				<tr>
					<th>make</th>
					<th>model</th>
					<th>year</th>
					<th>trim</th>
					<th>color</th>
					<th>doors</th>
					<th>vin</th>
					<th>daysOnLot</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach items="${newCars}" var="newCars">
						<tr>
							<td>${newCars.make}</td>
							<td>${newCars.model}</td>
							<td>${newCars.year}</td>
							<td>${newCars.trim}</td>
							<td>${newCars.color}</td>
							<td>${newCars.doors}</td>
							<td>${newCars.vin}</td>
							<td>${newCars.daysOnLot}</td>
						</tr>
					</c:forEach>
				</tr>
			</tbody>
			<tfoot>
			</tfoot>
		</table>

</body>
</html>