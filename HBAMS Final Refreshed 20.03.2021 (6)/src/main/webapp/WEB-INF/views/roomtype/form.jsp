<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red">${requestScope.message}</h3>
	<hr />
	<h4>Room CAtegory Form</h4>
	<hr />
	<form:form method="post" modelAttribute="roomtype">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>ICU</td>
				<td><form:checkbox path="icu" value="ICU" /></td>
				<td>Total ICU Rooms Available: </td>
				<td><form:input path="icuQuantity" /></td>
				<td>Price per day: </td>
				<td><form:input path="icuPrice" /></td>
			</tr>
			<tr>
				<td>Non-ICU</td>
				<td><form:checkbox path="nonicu" value="non-ICU" /></td>
				<td>Total Non-ICU Rooms Available: </td>
				<td><form:input path="nonicuQuantity" /></td>
				<td>Price per day: </td>
				<td><form:input path="nonicuPrice" /></td>
			</tr>

			<tr>
				<td>General</td>
				<td><form:checkbox path="general" value="General" /></td>
				<td>Total General Ward Available: </td>
				<td><form:input path="generalQuantity" /></td>
				<td>Price per day: </td>
				<td><form:input path="generalPrice" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>


		</table>

	</form:form>


</body>
</html>