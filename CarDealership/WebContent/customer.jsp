<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/customer.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>

			Customer Page
		
		<form action="DisplayCars" method="get">

		<div class="container">

			<button type="submit">DisplayCars</button>
<table>
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
  </table>
			<c:forEach items="${usedCars}" var="usedCars"> 
			${usedCars} <br>						
				
			</c:forEach>

		</div>
	</form>
		
		
		
		
		
		
</body>
</html>