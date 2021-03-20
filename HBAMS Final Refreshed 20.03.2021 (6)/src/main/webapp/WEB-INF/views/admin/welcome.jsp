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
		<div class="row" style="background-color: #80ff80">
			<div class="col-md-6" align="left">Welcome to Admin Panel</div>
			<div class="col-md-6" style="color: red" align="right">
				Login Successfully
				<h5>
					<a href="<spring:url value='/admin/logout'/>">Log Out </a>
				</h5>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">

			<div class="col-lg-12"
				style="font-style: italic; font-family: serif; font-size: 250%;"
				align="left">Hello, ${sessionScope.admin_details.userName}</div>

		</div>
		<div class="col-lg-6"></div>
		<div class="alert alert-danger" role="alert">
			${requestScope.message}</div>
	</div>
	<hr />
	<div class="container">
		<h3 style="font-family: serif;" align="center">Hospitals List</h3>
		<table class="table table-hover">

			<tr style="background-color: #ffcccc; color: black">
				<th>Hospital ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Contact No</th>
				<th>Delete Hospital</th>
			</tr>
			<c:forEach var="v" items="${requestScope.hospital_list}">
				<tr>
					<td>${v.hospitalAdminID}</td>
					<td>${v.name}</td>
					<td>${v.address}</td>
					<td>${v.city}</td>
					<td>${v.state}</td>
					<td>${v.contactNo}</td>
					<td><a
						href="<spring:url value='/hospital/delete?vhid=${v.hospitalAdminID}'/>">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>