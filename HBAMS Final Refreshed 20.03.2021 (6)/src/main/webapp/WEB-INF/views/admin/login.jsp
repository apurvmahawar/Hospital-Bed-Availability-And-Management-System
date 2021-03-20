<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<img src="${pageContext.request.contextPath}/images/admin.png"
					height="100" width="100" />Admin Login Page
			</h1>
		</div>
		<hr />
		<div class="column" align='center'>

			<div class='col-md-6'>
				<div class="alert alert-danger" role="alert">
					${requestScope.message}</div>
				<form method="post">
					<table style="background-color: #80ff80; margin: auto;">
						<tr>
							<td>Enter User Name</td>
							<td><input placeholder="Admin User Name" type="text"
								name="user_name" /></td>
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
		</div>
	</div>
</body>
</html>