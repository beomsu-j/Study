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
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(//id.equals(id)&&pw.equals(pw)
				id.equals("smart")&&pw.equals("123")){
			// 보내고싶은/공유하고 싶은 데이터를 포함해서 요청한다
			//-> get방식에서 사용할 수 있는 query String문법
			//response.sendRedirect("Ex03_LoginSuccess.jsp?nickName="+id);
			//response.sendRedirect("Ex03_LoginSuccess.jsp?id="+id);
			
			// forward 방식 : 요청에 대한 내용을 공유하며 새로운 요청을 할 수 있는 기법
			RequestDispatcher rd = request.getRequestDispatcher("Ex03_LoginSuccess.jsp");
			// 공유하고자 하는 데이터 연결하기
			request.setAttribute("id", id);
			rd.forward(request, response);
		}else{
			response.sendRedirect("Ex03_LoginFail.jsp");
		}
	%>
	
</body>
</html>