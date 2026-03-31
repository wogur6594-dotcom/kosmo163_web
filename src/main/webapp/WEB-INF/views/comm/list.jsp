<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Contents List</h4>
	<h5>Locale A</h5>

	<h5>Locale C</h5>

	<h5>Home B</h5>

	<div>
		<a href="./create"> Create Contents </a>
	</div>

	<div>
		<table>
			<thead>
				<tr>
					<th>Contents No.</th>
					<th>Title</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.commNum}</td>
						<td><a href="./detail?commNum=${d.commNum}">${d.commName}</a></td>
					</tr>
					<!-- 
						getter의 이름 : getter메서드에서
						get을 빼고 () 빼고
						첫글자를 소문자로 바꾼거
						ex) getName() => name
					-->



				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>