package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post 방식일때
		// 넘겨주는 요청에 대한 한글 인코딩이 필요하다
		request.setCharacterEncoding("utf-8");
		
		// 1. 보내주는 데이터 꺼내오기
		String name = request.getParameter("name");
		
		// 2. 응답 화면을 한글 인코딩
		response.setContentType("text/html; charset=utf-8");
		
		// 3. 출력을 위한 기능 가져오기
		PrintWriter out = response.getWriter();
		out.print("입력 이름 : "+ name);
	}

}
;