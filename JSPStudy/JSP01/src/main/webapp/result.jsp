<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선호도 조사 결과</h1>
	<fieldset>
		<legend></legend>
		<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String[] arr = request.getParameterValues("ran"); 
		%>
        이름 : <%= name %>
        <br>
        좋아하는 과일 : <%= arr %>
        
	</fieldset>
</body>
</html>