<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.commTitel}</title>
</head>
<body>
	<h1>Community Detail Page</h1>
		
		<h4>${dto.commNum}</h4>
		<h4>${dto.commTitle}</h4>
		<h4>${dto.commName}</h4>
		<h4>${dto.commContents}</h4>
		<h4>${dto.commTime}</h4>
		<h4>${dto.commStar}</h4>
		
		<a href="./update?commNum=${dto.commNum}">Edit</a>
		
		<a href="./delete?commNum=${dto.commNum}">Delete</a>
		<form action="./delete" method="get">
		<input type="hidden" name="commNum"  value="${dto.commNum}">
		<button>DELETE</button>
		
		</form>
		
</body>
</html>