<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/LoadCars" />


<!doctype html>
<html lang="en">
<head>

    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" >


<title>New Cars</title>
</head>
<body>


   
<div class="row mb-3">
					<div class="col-md-4 themed-grid-col"></div>
					<div class="col-md-4 themed-grid-col">
						<h5>USED CARS</h5>
					</div>

				</div>
   <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
		<c:if test="${usedCars != null}">		
            <c:forEach var="usedCar" items="${usedCars}">

                <div class="col">
                    <div class="card  bg-dark text-light w-100 p-3 h-100 ">
                        <img class="img-fluid w-100 p-3 h-100 d-inline-block" src="${usedCar.image}" alt="Card image cap">
                        <div class="card-body w-100 p-3 h-100">
                            <p>
                               This <c:out value="${usedCar.year}"/> <c:out value="${usedCar.make}" /> <c:out value="${usedCar.model}" /> is a great deal, only  
                               <c:out value="${usedCar.price}"/>! <br>
                               MPG: <c:out value="${usedCar.mpg}"/><br>
                               Trim: <c:out value="${usedCar.trim}"/><br>
                               Doors: <c:out value="${usedCar.doors}"/><br>
                               Miles: <c:out value="${usedCar.miles}"/><br>
                               vin: <c:out value="${usedCar.vin}"/><br>
                               Price: <c:out value="${usedCar.price}"/><br>
                               Days: <c:out value="${usedCar.daysOnLot}"/><br>
                       
                            </p>
                            <p class="card-text"><c:out value="${usedCar.description}" />
                        </div>
                    </div>        
                </div>  
            </c:forEach>
        </c:if>       
    </div>

</body>
</html>