<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">	
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
	<legend>랜덤숫자입력</legend>	
	<!-- 1. html 이 보내주는 데이터 꺼내오기
		 2. 주제를 입력할 수 있는 input 태그 생성
		 꺼내온 데이터의 값에 따라 아이템을 입력할 수 있는 input 태그 생성
		  데이터를 보낼 수 있는 구조로 만들어 전달-->
	<form action="Ex01_randomWinner.jsp" method="post">
		  
		주제 : <input type="text" name="title"><br>
		 
	 <% 
	    int n =Integer.parseInt(request.getParameter("ranNum"));
			// for문의 영역을 완벽하게 구분하여 작성
			// 내장객체인 out을 사용하여 태그를 입력
		
		for(int i=1;i<=n;i++){ 
			out.print("<input type='text'name='ran'><br>");
			// 포문 쓰는 방법은 메모장
		}
					
	 %>
	
	<input type="submit" value="시작">
	</form>
	</fieldset>
</body>
</html>