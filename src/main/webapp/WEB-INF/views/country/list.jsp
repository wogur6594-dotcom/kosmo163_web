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
	<h4>국가 리스트</h4>
	<h5>Locale A</h5>

	<h5>Locale C</h5>

	<h5>Home B</h5>
	
	<div>
		<a href="./create"> Country Create </a>
	
	
	</div>

	<div>
		<table>
			<thead>
				<tr>
					<th>Country No</th>
					<th>Country Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.departmentId}</td>
						<td><a href="/dept/detail?countryId=${d.countryId}">${d.countryName}</a></td>
					</tr>


				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>