<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Available Bed Quantity and Price</h3>

	<table class="table table-hover" style="background-color: cyan;"">
		<tr>
			<th>Room Category</th>
			<th>Room Price</th>
			<th>Number of Rooms Available</th>
		</tr>

		<tr>
			<td>ICU</td>
			<td>${sessionScope.room_details.icuPrice}</td>
			<td>${sessionScope.room_details.icuQuantity}</td>
		</tr>
		<tr>
			<td>Non-ICU</td>
			<td>${sessionScope.room_details.nonicuPrice}</td>
			<td>${sessionScope.room_details.nonicuQuantity}</td>
		</tr>
		<tr>
			<td>General Ward</td>
			<td>${sessionScope.room_details.generalPrice}</td>
			<td>${sessionScope.room_details.generalQuantity}</td>
		</tr>
	</table>
	<a href="<spring:url value='/user/enduserlist'/>">Back to Hospitals
		List</a>
</body>
</html>