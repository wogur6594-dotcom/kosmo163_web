<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h3>Member Join Page</h3>

	<form action="/mem/join" method="post">
		<div>
			<label> 회원 ID </label>
			<!-- DTO의 setter의 이름과 동일하게 -->
			<input type="text" placeholder="ID 입력" name="memberId">
		</div>
		<div>
			<label> 비밀번호 </label> <input type="password" name="memberPw"
				placeholder="PassWord">
		</div>

		<div>
			<label> 이름 </label> <input type="text" placeholder="이름"
				name="memberName">
		</div>

		<div>
			<label> 이메일 </label> <input type="text"
				placeholder="Email" name="memberEmail">
		</div>

		<input type="submit" value="회원가입">


	</form>

</body>
</html>