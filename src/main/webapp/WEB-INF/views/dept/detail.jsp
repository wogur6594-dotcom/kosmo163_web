<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEPT Detail Page</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>

<div class="container mt-4">
    <h1 class="mb-4">DEPT Detail Page</h1>

    <table class="table table-striped table-bordered">
        <thead class="table-light">
            <tr>
                <th>부서번호</th>
                <th>부서명</th>
                <th>관리자코드</th>
                <th>지역코드</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${dto.departmentId}</td>
                <td>${dto.departmentName}</td>
                <td>${dto.managerId}</td>
                <td>${dto.locationId}</td>
            </tr>
        </tbody>
    </table>

    <div class="mt-3">
        <a href="./update?departmentId=${dto.departmentId}" class="btn btn-info">수정</a>
        
        <form action="./delete" method="get" style="display:inline;">
            <input type="hidden" name="departmentId" value="${dto.departmentId}">
            <button type="submit" class="btn btn-danger">삭제</button>
        </form>
    </div>
</div>

</body>
</html>