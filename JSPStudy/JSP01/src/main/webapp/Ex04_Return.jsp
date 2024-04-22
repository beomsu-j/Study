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
//1. post로 넘어오는 요청에 ㅜ대하여 인코딩 작업!
request.setCharacterEncoding("utf-8");

//2. 요청에 대한 데이터값 꺼내오기 > 3개 데이터
int n1 = Integer.valueOf(request.getParameter("num1"));
int n2 = Integer.valueOf(request.getParameter("num2"));
String op=request.getParameter("op");

//3. 가져온 데이터에 대한 로직 처리
int result=0;
if ("+".equals(op)) {
     result= n1 + n2;
} else if ("-".equals(op)) {
     result = n1 - n2;
} else if ("*".equals(op)) {
    result = n1 * n2;
} else {
    result = n1 / n2;
}
//out.print(result); 콘솔에 나옴
%>
<!--  4. 결과에 대한 출력화면 만들기 -->
<%= n1 %>
<%= op %>
<%= n2 %>
<%= "=" %>
<%= result %>
	
</body>
</html>