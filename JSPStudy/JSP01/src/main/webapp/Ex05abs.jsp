<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  1. 절대값을 구할수 있는 메소드 선언!
      2. 해당 메소드를 호출하여 결과 확인!
 -->

   <%!private int abs(int num1) {
      int result = num1 > 0 ? num1 : num1 * (-1);
      return result;
   }%>
   5의절대값 :<%=abs(5)%>
   <br> -5의절대값 :<%=abs(-5)%>
</body>
</html>