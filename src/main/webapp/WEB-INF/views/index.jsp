<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Member Page</h1>
		<a href="/mem/join">회원가입</a>
		
		<c:if test="${empty dto}">
		<a href="/mem/login">Login</a>
		</c:if>
		
		<c:if test="${not empty dto}">
		<a href="/mem/logout">Logout</a>
		</c:if>
		
	</body>
</html>