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
	<h1>Registration Page Hospital</h1>
	<hr />

	<form:form method="post" modelAttribute="hospital">
		<table>
			<tr>
				<td>Hospital Unique ID</td>
				<td><form:input path="hospitalAdminID" /></td>
				<td style="color: red"><form:errors path="hospitalAdminID" /></td>
			</tr>

			<tr>
				<td>Hospital Name</td>
				<td><form:input path="name" /></td>
				<td style="color: red"><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="address" /></td>
				<td style="color: red"><form:errors path="address" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
				<td style="color: red"><form:errors path="city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><form:input path="state" /></td>
				<td style="color: red"><form:errors path="state" /></td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><form:input path="contactNo" /></td>
				<td style="color: red"><form:errors path="contactNo" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="hospitalAdminPassword" /></td>
				<td style="color: red"><form:errors
						path="hospitalAdminPassword" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Proceed" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>