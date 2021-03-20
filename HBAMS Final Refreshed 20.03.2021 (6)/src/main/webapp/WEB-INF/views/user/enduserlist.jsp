<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<div class="container">
		<h4 style="color: red;">${requestScope.message}</h4>
		<form method="post">
			<table style="background-color: #ffcccc; margin: auto; color: black">
				<tr>
					<td>Enter City Name</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td></td>
					<td align='right'><input type="submit" value="Search" /></td>
				</tr>
			</table>
		</form>

		<hr />
		<hr />
		<h2 style="font-family: serif;" align="center">Hospitals List</h2>
		<table class='table table-hover'>
			<tr style="background-color: #ffcccc; color: black;">
				<th>Hospital ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Contact No</th>
				<th>Beds List</th>
			</tr>
			<c:forEach var="h" items="${sessionScope.hospital_list}">
				<tr>
					<td>${h.hospitalAdminID}</td>
					<td>${h.name}</td>
					<td>${h.address}</td>
					<td>${h.city}</td>
					<td>${h.state}</td>
					<td>${h.contactNo}</td>
					<td><a
						href="<spring:url value='/user/bedlist?hid=${h.hospitalID}'/>">Show
							Beds at ${h.name}</a></td>

				</tr>
			</c:forEach>

		</table>

	</div>
</body>
</html>