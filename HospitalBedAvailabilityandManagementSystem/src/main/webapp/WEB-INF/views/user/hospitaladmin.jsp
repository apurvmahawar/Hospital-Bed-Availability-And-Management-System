<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hospital Login Panel</h1>
	<hr />
	<h4 style="color: red;">${requestScope.message}</h4>
	<form method="post">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Hospital ID</td>
				<td><input type="text" name="hospital_id" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>