<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/LoadCars" />


<!doctype html>
<html lang="en">
<head>

	<meta charset="ISO-8859-1">
	
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link rel="stylesheet" 
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
		crossorigin="anonymous">

  	<link rel="stylesheet" type="text/css" href="styles/displayCars.css">

<title>Used Cars</title>
</head>
<body class="p-3 bg-dark text-light">
	<div class= "container text-center">
				<div class="d-flex flex-row">
					<div class="col"></div>
					<div class="col">
						<h5>USED CARS</h5>
					</div>
					<div class="col"></div>
				</div>
   </div>

   <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
		<c:if test="${usedCars != null}">		
            <c:forEach var="usedCar" items="${usedCars}">

                <div class="col">
                    <div class="card  bg-dark text-light w-100 p-3 h-100 ">
                        <img class="img-fluid w-100 p-3 h-100 d-inline-block" src="${usedCar.image}" alt="Card image cap">
                        <div class="card-body p-3">
                        	<p class="card-text">This <c:out value="${usedCar.year}"/> <c:out value="${usedCar.make}" /> <c:out value="${usedCar.model}" /> 
                        			is a great deal, only <c:out value="${usedCar.price}"/>! </p>
                        	<div class="dropdown d-flex justify-content-center align-items-center">
							  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							    Details
							  </button>
							  <div class="dropdown-menu bg-dark " aria-labelledby="dropdownMenuButton">
							    <a class="dropdown-item text-light">MPG: <c:out value="${usedCar.mpg}"/></a>
							    <a class="dropdown-item text-light">Trim: <c:out value="${usedCar.trim}"/></a>
							    <a class="dropdown-item text-light">Doors: <c:out value="${usedCar.doors}"/></a>
							    <a class="dropdown-item text-light">Miles: <c:out value="${usedCar.miles}"/></a>
							    <a class="dropdown-item text-light">vin: <c:out value="${usedCar.vin}"/></a>
							    <a class="dropdown-item text-light">Price: <c:out value="${usedCar.price}"/></a>
							    <a class="dropdown-item text-light"><c:out value="${usedCar.description}"/></a>		  
							  </div>
							</div>
                        </div>
                    </div>        
                </div>  
            </c:forEach>
        </c:if>       
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