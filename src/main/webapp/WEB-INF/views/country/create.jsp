<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Country Create Page</h3>
	
	<form action = "./create" method="post">
		<div>
		<label>Country Name</label>
		<!-- DTO의 setter의 이름과 동일하게 -->
		<input type="text" name="countryName">
		</div>
		<div>
		<label>Region Id</label>
		<input type="text" name="regionId">
		</div>
		
		<div>
		<lavel>Country Id</lavel>
		<input type="text" name="countryId">
		</DIV>
		
		<button type="submit">button</button>
		<input type="submit" value="Create">
		<input type="button" value="등록(그냥버튼)">
		
		<input type="reset" value="reset">
	
	</form>
	
	
	
</body>
</html>