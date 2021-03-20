<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Allocation Page</title>
</head>
<body>
	<div class='container'>
		<h3 style="color: red">${requestScope.message}</h3>
		<h1>Room Allocation Page</h1>
		<form:form method="post" modelAttribute="room">
			<div class='row' align="center">
				<div class='col-md-12'>
					<p>Select Room Type</p>
					<br> ICU:
					<form:radiobutton path="roomType" value="ICU" />
					<br> non-ICU:
					<form:radiobutton path="roomType" value="non-ICU" />
					<br> General:
					<form:radiobutton path="roomType" value="General" />
					<br>
				</div>
				<div class='col-md-12'>
					<form:errors path="roomType" />
					<br> <input type="submit" value="Allocate" />
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>