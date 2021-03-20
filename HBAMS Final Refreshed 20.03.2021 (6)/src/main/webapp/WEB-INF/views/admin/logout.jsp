<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Logout Page</h1>
	<h3>Hello, ${sessionScope.admin_details.userName} you have been
		logged out successfully</h3>
	<p>
		Session Invalidated for your request<br> Kindly login Again with
		Right Credentials
	</p>
	<a href="<spring:url value='/admin/login'/>">Back To Main Page</a>
</body>
</html>