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
						<h5>NEW CARS</h5>
					</div>
					<div class="col-md-4 themed-grid-col"></div>
				</div>
   <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
		<c:if test="${newCars != null}">		
            <c:forEach var="newCar" items="${newCars}">

                <div class="col">
                    <div class="card  bg-dark text-light w-100 p-3 h-100 ">
                        <img class="img-fluid w-100 p-3 h-100 d-inline-block" src="${newCar.image}" alt="Card image cap">
                        <div class="card-body w-100 p-3 h-100">
                            <p>
                               This <c:out value="${newCar.year}"/> <c:out value="${newCar.make}" /> <c:out value="${newCar.model}" /> is a great deal, only  
                               <c:out value="${newCar.price}"/>! <br>
                               MPG: <c:out value="${newCar.mpg}"/><br>
                               Trim: <c:out value="${newCar.trim}"/><br>
                               Doors: <c:out value="${newCar.doors}"/><br>
                               Miles: <c:out value="${newCar.miles}"/><br>
                               vin: <c:out value="${newCar.vin}"/><br>
                               Price: <c:out value="${newCar.price}"/><br>
                       
                            </p>
                            <p class="card-text"><c:out value="${newCar.description}" />
                        </div>
                    </div>        
                </div>  
            </c:forEach>
        </c:if>       
    </div>

</body>
</html>