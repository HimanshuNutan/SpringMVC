<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="5">
		<tr>
			<th>flightId</th>
			<th>departurecity</th>
			<th>arrivalcity</th>
			<th>departuretime</th>
			<th>arrivaltime</th>
			<th>seatlowprice</th>
			<th>seatmediumprice</th>
			<th>seathighprice</th>
			<th>totalseats</th>
			<th>availableseats</th>
		</tr>
		<c:forEach items="${flightList}" var="flight">
		<tr>
			<td>${flight.flightid}</td>
			<td>${flight.departurecity}</td>
			<td>${flight.arrivalcity}</td>
			<td>${flight.departuretime}</td>
			<td>${flight.arrivaltime}</td>
			<td>${flight.seatlowprice}</td>
			<td>${flight.seatmediumprice}</td>
			<td>${flight.seathighprice}</td>
			<td>${flight.totalseats}</td>
			<td>${flight.availableseats}</td>
			<td>
				<a href="updateFlight/${flight.flightId}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="deleteFlight/${flight.flightId}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>