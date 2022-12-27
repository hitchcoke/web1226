<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@page import="vo.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${loginMember.memberName} 님 반갑습니다</h3>
	<a href="${pageContext.request.contextPath}/LogoutController">로그아웃</a>

</body>
</html>