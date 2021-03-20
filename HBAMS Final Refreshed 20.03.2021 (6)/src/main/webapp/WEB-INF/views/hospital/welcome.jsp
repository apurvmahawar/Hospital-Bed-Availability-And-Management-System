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
	<div class="container">
		<div class="row" style="background-color: #80ff80">
			<div class="col-md-4" align="left">Welcome to Hospital Admin
				Panel</div>
			<div class="col-md-8" style="color: red" align="right">
				Login Successfully with Hospital ID:
				${sessionScope.hospital_details.hospitalAdminID}
				<h5>
					<a href="<spring:url value='/hospital/logout'/>">Log Out </a>
				</h5>
			</div>

		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-12"
				style="font-style: italic; font-size: 500%; font-family: serif;"
				align="center">${sessionScope.hospital_details.name}</div>


		</div>
		<hr />
		<div class="row">
			<div class="col-md-12" align="justify"
				style="font-size: medium; color: black; background-color: #66e0ff;">
				<h5 align="right" style="color: black; font-style: italic;">Hospital
					Details</h5>
				<p>
					Hospital ID: ${sessionScope.hospital_details.hospitalAdminID}<br>
					Location: ${sessionScope.hospital_details.address}<br> City:
					${sessionScope.hospital_details.city}<br> State:
					${sessionScope.hospital_details.state}<br> Contact No.:
					${sessionScope.hospital_details.contactNo}
				</p>
			</div>
		</div>

		<hr />
		<h4 style="color: red;">${requestScope.message}</h4>
		<a href="<spring:url value='/patient/register'/>">Add a Patient</a> <br>
		<a href="<spring:url value='/patient/list'/>">List of Admitted
			Patients</a>
		<hr />
	</div>
	<%-- <%
		session.setAttribute("details1", session.getAttribute("details"));
	%> --%>
</body>
</html>