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
	<div class="container" align='center'>
		<div class="jumbotron">
			<h1>
				<img src="${pageContext.request.contextPath}/images/hospital.png"
					height="100" width="100" />Hospital Login Panel
			</h1>
		</div>
		<hr />
		<div class="column" align='center'>
			<div class="alert alert-danger" role="alert">
				${requestScope.message}</div>
			<form method="post">
				<table style="background-color: #80ff80;" align="center">
					<tr>
						<td>Enter Hospital Unique ID</td>
						<td><input placeholder="Hospital ID" type="text"
							name="hospital_id" /></td>
					</tr>
					<tr>
						<td>Enter Password</td>
						<td><input placeholder="Password" type="password"
							name="password" /></td>
					</tr>
					<tr>
						<td></td>
						<td align='right'><input type="submit" value="Login" /></td>
					</tr>
				</table>

			</form>

		</div>
		<hr />
		<h6>
			<p>Does'nt have a account ?</p>
			<a href="<spring:url value='/hospital/register'/>">Sign up now</a>
		</h6>
	</div>

</body>
</html>
