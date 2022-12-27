<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InsertMemberForm</title>
</head>
<body>
	<h1>singIn</h1>
	<form method="post" action="${pageContext.request.contextPath}/InsertMemberAction">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="password" name="memberPw"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="memberName"></td>
			</tr>
			
		</table>
			<button type="submit">회원가입</button>
	</form>
</body>
</html>