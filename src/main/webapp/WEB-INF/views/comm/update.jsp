<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Create Contents Page</h3>

	<form action="./create" method="post">
		<div>
			<label>Title</label> <input type="text" placeholder="제목 입력"
				name="commTitle">
		</div>
		<div>
			<label>Contents</label> <input type="text" name="commContents"
				placeholder="내용 입력">
		</div>
		<div>
			<label>Star</label> <input type="number" name="commStar"
				placeholder="중요도 : (1~5)">
		</div>
		<button type="sumit">Create</button>
		<input type="reset" value="Reset">


	</form>

</body>
</html>