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
<title>LOGIN PANEL</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 align="center">Welcome to Hospital User Panel</h1>
			<p>Choose your User Type</p>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-4" align="center">
				<a href="<spring:url value='/admin/login'/>"><img
					src="${pageContext.request.contextPath}/images/admin.png"
					height="100" width="100" /></a><br> <a
					href="<spring:url value='/admin/login'/>">Admin Login</a>
			</div>
			<div class="col-md-4" align="center">
				<a href="<spring:url value='/hospital/login'/>"><img
					src="${pageContext.request.contextPath}/images/hospital.png"
					height="100" width="100" /></a><br> <a
					href="<spring:url value='/hospital/login'/>">Hospital Admin
					Login</a>
			</div>
			<div class="col-md-4" align="center">
				<a href="<spring:url value='/user/enduserlist'/>"><img
					src="${pageContext.request.contextPath}/images/bed.png"
					height="100" width="100" /></a><br> <a
					href="<spring:url value='/user/enduserlist'/>">Bed Availability
					in Nearby Hospital</a>
			</div>
		</div>
	</div>
</body>
</html>