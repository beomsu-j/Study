package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation 
// 주석처럼 사용되는 기능!  -> 차이점 :무언가를 실제로 실행할 수 있는 기능을 가지고 있다.

// @WebServlet : url 맵핑 기술
// 웹브라우저에서 서블릿을 동작시키기 위해 실제 자바클래스의 이름 대신 서블릿을 요청하기
// 위한 문자열을 서블릿 클래스와 맵핑시키는것
// / 기호 꼭 쓰기
@WebServlet("/print")
public class ex01_print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 한글 인코딩 작업
		response.setContentType("text/html; charset=utf-8");
		
		// 웹 화면에 출력문 띄우기
		PrintWriter out = response.getWriter();
		
		out.print("<h1>조범수 바보</h1>");
		
	}

}
