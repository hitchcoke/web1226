<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	<form method="post" action="${pageContext.request.contextPath}/LoginActionController">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="memberId"></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="password" name="memberPw"></td>
			</tr>
		</table>
		<button type="submit">로그인</button>
	</form>
	<br>
	
	<a href="${pageContext.request.contextPath}/insertMemberForm">회원가입</a>	

</body>
</html>