<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h3> LogIn Page </h3>
	
	<form action="/mem/login" method="post">
		<div>
			<label> 회원 ID </label>
			<!-- DTO의 setter의 이름과 동일하게 -->
			<input type="text" placeholder="ID입력" name="memberId">
		</div>
		<div>
			<label> 패스워드 </label>
			<input type="password" name="memberPw" placeholder="PASSWORD">
		</div>
		<button>Login</button>


	
	</form>

</body>
</html>