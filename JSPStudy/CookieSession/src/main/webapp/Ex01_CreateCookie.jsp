<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	
		// 쿠키에 대한 작업은 자바언어로 진행해야 한다.
		// new Cookie("문자","문자") 공백 x 
		// -> 순수 문자가 아니라 공백이 들어가는 경우 : 공백을 포함한 문자를 인코딩
			
		// 1. 쿠키생성
		
		Cookie cookie = new Cookie("first","");
	
		// 2. 쿠키의 유효기간 설정 -> 기본단위 = 초단위
		cookie.setMaxAge(124700);	
		
		// 쿠키 값 수정하기
		cookie.setValue("test_cookie");
		
		// 3. 스크립트릿(서버의 역할)에서 클라이언트에게 쿠키 전달 
		response.addCookie(cookie);
		// 쿠키 추가 생성하기 -> 간단한 방법
		response.addCookie(new Cookie("test2","test"));
		response.addCookie(new Cookie("test3","test"));
	
	%>

	<h1>쿠키 생성하기</h1>

	<a href ="Ex01_GetCookie.jsp">쿠키 확인하기</a>


</body>
</html>