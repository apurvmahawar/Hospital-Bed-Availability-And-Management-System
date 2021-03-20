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
	<h1>Insert Patient Details</h1>
	<p>Patient admitted in Hospital UID-->
		${sessionScope.details1.hospitalAdminID}</p>
	<hr>
	<form:form method="post" modelAttribute="patient">
		<table>
			<tr>
				<td>name</td>
				<td><form:input path="name" /></td>
				<td style="color: red"><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>gender</td>
				<td><form:input path="gender" /></td>
				<td style="color: red"><form:errors path="gender" /></td>
			</tr>

			<tr>
				<td>age</td>
				<td><form:input path="age" /></td>
				<td style="color: red"><form:errors path="age" /></td>
			</tr>
			<tr>
				<td>contactNo</td>
				<td><form:input path="contactNo" /></td>
				<td style="color: red"><form:errors path="contactNo" /></td>
			</tr>
			<tr>
				<td>address</td>
				<td><form:input path="address" /></td>
				<td style="color: red"><form:errors path="address" /></td>
			</tr>
			<tr>
				<td>city</td>
				<td><form:input path="city" /></td>
				<td style="color: red"><form:errors path="city" /></td>
			</tr>
			<tr>
				<td>state</td>
				<td><form:input path="state" /></td>
				<td style="color: red"><form:errors path="state" /></td>
			</tr>
			<tr>
				<td>disease</td>
				<td><form:input path="disease" /></td>
				<td style="color: red"><form:errors path="disease" /></td>
			</tr>
			<tr>
				<td>admitDate</td>
				<td><form:input value="<%=java.time.LocalDate.now()%>"
						path="admitDate" /></td>
				<td style="color: red"><form:errors path="admitDate" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Proceed" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>