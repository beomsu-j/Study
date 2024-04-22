<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<fieldset>	
		<legend>로그인 성공!</legend>
			<%
			// get방식의 쿼리 스티링 문법 사용시 데이터 꺼내오기
			// String id = request.getParameter("nickName");
			
			// forward 방식으로 넘어온 데이터 꺼내오기
			// getAttribute()의 반환타입은 object이므로 변수에 저장할때는 형변환이 필요하다
			String id =(String) request.getAttribute("id");
			out.print(id+"님 환영합니다.");
			%>
			<br><br> 
			<a href="Ex03_Login.html" >로그아웃</a>
	</fieldset>	
</body>
</html>