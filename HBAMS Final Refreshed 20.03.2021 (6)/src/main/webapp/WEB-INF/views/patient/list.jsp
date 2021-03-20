<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Patient List</h1>
	<table class="table table-hover" style="background-color: cyan;">
		<tr>
			<th>patientID</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Age</th>
			<th>Contact no</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Disease</th>
			<th>Admit Date</th>
			<th>Discharge and Generate Bill</th>


		</tr>
		<c:forEach var="v" items="${sessionScope.patient_list}">
			<tr>
				<td>${v.patientID}</td>
				<td>${v.name}</td>
				<td>${v.gender}</td>
				<td>${v.age}</td>
				<td>${v.contactNo}</td>
				<td>${v.address}</td>
				<td>${v.city}</td>
				<td>${v.state}</td>
				<td>${v.disease}</td>
				<td>${v.admitDate}</td>
				<td><a
					href="<spring:url value='/bill/generatedbill?vpid=${v.patientID}'/>">Click Here</a></td>


			</tr>
		</c:forEach>
	</table>
</body>
</html>