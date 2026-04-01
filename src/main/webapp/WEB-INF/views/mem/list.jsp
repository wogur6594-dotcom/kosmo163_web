<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>
	<h1>Member List</h1>
	<c:forEach items="${list}" var="m">
	<h3>${m.memberName} /
	${m.memberId} /
	${m.memberEmail}</h3>
	</c:forEach>
</body>
</html>

