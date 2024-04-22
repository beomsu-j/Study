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
	// 자바 언어를 입력할 수 있는 영역
	int hap=0;
	
	for(int i=1;i<=100;i++){
		   hap += i;
	}
	%>


	1~100까지 합 : <%= hap %>


</body>
</html>