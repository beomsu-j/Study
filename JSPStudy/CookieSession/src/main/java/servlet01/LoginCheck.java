package servlet01;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 한글인코딩
		request.setCharacterEncoding("utf-8");
		// id,pw 불러오기 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 조건문
		
		// 조건문에 해당하면 세션 꺼내오기
		// 세션안에 내 이름데이터 집어 넣기
		// main.jsp로 redirection 방식으로 이동
		if(id.equals("test")&&pw.equals("12345")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("nickname","조범수");
			response.sendRedirect("Main.jsp");
		}else {
			
			
			response.sendRedirect("Loginform.jsp");
		}
	}

}
