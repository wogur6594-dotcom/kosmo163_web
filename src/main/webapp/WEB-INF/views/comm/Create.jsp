<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Create Contents Page </h3>
	
	<form action="./create" method="post">
		<div>
			<label> Title </label>
			<!-- DTO의 setter의 이름과 동일하게 -->
			<input type="text" placeholder="제목 입력" name="commTitle">
		</div>
		<div>
			<label> Name </label>
			<input type="text" name="commName" placeholder="이름입력">
		</div>
		
		<div>
			<label> ConTents </label>
			<input type="text" placeholder="내용입력" name="commContents">
		</div>

		<div>
			<label> Importance Star </label>
			<input type="text" placeholder="중요도입력(1~5)" name="commStar">
		</div>

		<input type="submit" value="create">		
		<input type="reset" value="reset">
	
	</form>

</body>
</html>