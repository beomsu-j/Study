<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>쿸이확인펫지</h1>
	
	<%
		Cookie [] result =request.getCookies();
		
	
		for(int i = 0; i<result.length;i++){
			out.print(result[i].getName()+" / "+result[i].getValue()+"<br>");
		}
	
	%>


	<a href="Ex01_RemoveCookie.jsp">쿸잌삭제펫지</a>

	
	



</body>
</html>