<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<jsp:include page="/DisplayCars" />



<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>New Cars</title>
</head>
<body>





	<table class="table table-hover table-dark" style="color:Tomato;">
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

</body>
</html>