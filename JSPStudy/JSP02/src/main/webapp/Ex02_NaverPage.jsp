<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- HTML 파일의 요청에 따라 응답 할 수 있는 페이지 -->
	<% 
		System.out.println("Ex02_NaverPage.jsp 실행");
		response.sendRedirect("http://www.naver.com");
	
	%>

</body>
</html>