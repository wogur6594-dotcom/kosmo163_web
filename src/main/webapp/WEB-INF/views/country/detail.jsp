<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DEPT Detail Page</h1>
	
	<h4>${dto.countryId}</h4>
	<h4>${dto.countryName}</h4>
	<h4>${dto.regionId}</h4>
	<a href=".delete?countryId=${dto.countryId}">삭제</a>
	<!-- 속성은 쌍따옴표 안에 -->
	<form action="./delete" method="get">
		<input type="hidden" name="countryId" value="${dto.countryId}">
		<button>DELETE</button>
	</form>
	
	
</body>
</html>