<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>메인 페이지</h3>
	<c:forEach begin="1" end="5" step="1">
		${nickname}님 환영합니다. 
		<!-- 
		EL의 장점
		>> request, session (scope/ 저장공간 범위) 등등 
		   알아서 데이터를 찾아서 다운캐스팅까지 진행
		 -->
	</c:forEach>
	<a href="Logout">로그아웃</a>
	
</body>
</html>