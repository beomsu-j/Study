<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">.
<!-- 
	1.createInput.jsp에서 넘겨주는
	title, item 데이터에서 꺼내오기
	
	2. 가지고온 item의 개수에 따라 랜덤으로 한가지 주제 출력
 -->
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
		<legend></legend>
		<%
		// 1. post방식의 한글 데이터 인코딩 작업하기
		request.setCharacterEncoding("utf-8");
		// 2. 요청값으로 부터 데이터 꺼내오기
		String title = request.getParameter("title");
		// 3. 다수의 데이터가 하나의 그룹으로 지정되어 있을 때 꺼내오는 방법!
		String[] arr = request.getParameterValues("ran");
		// 4. 랜덤 수 생성하기
		Random rn = new Random();
		int i = rn.nextInt(arr.length);
		// 5. 출력하기
		//out.print(title+"<br>");
		//out.print(arr[i]);
		%>
		<%= title %><br>
		<%= arr[i] %>
	</fieldset>
</body>
</html>