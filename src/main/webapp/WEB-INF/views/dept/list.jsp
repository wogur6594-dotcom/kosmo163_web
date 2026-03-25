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


	<h2>Departments List</h2>

	<div>
		<table>
			<thead>
				<tr>
					<th>Department No.</th>
					<th>Department Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.departmentId}</td>
						<td>${d.departmentName}</td>
					</tr>
					<!-- 
				getter의 이름 : getter메서드에서
				get을 빼고 () 뺀거	
				첫글자를 소문자로 바꾼거
				ex) getName() => name
			 -->
			</tbody>
			</c:forEach>

		</table>
	</div>


</body>
</html>