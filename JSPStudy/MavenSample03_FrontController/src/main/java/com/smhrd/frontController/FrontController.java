package com.smhrd.frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.controller.Join;
import com.smhrd.controller.Login;
import com.smhrd.controller.Logout;
import com.smhrd.controller.SelectAll;
import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	// 모든 요청은 반드시 FC를 거쳐서만 넘어갈 수 있게끔 설계
	// 이유는 ?
	// >> 중복되는 코드 방지
	// >> HttpServlet이 엄청 무겁고 자원을 많이 차지함
	// > servlet역할을 하는 파일을 한개만 놔둘거임
	// > 이 파일을 클래스한테 보내줄거임
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. URI 가져오기
		String uri = request.getRequestURI();
		// System.out.println("요청 uri "+ uri);

		// 2. CP(ContextPath) 가져오기
		String cp = request.getContextPath();
		// System.out.println("요청 cp "+ cp);

		// 3. uri에서 cp자르기
		// ex) /web/Login.do --> login.do
		String path = uri.substring(cp.length() + 1);
		// System.out.println("자른 path "+ path);

		// 4. 최종경로가 무엇으로 끝나는지에 따라 서로 다른 기능 실행

		// 중복코드1. 한글인코딩 잡아주기
		request.setCharacterEncoding("utf-8");
		
		// 최종경로를 의미하는 변수
		String finalPath = null;
		
		Command com = null;

		// 4-1. Join.do와 최종경로가 같다면 회원가입 기능을 실행
		if (path.equals("Join.do")) {
			
			com = new Join();
			
			
		} else if (path.equals("Login.do")) {
			
			com = new Login();
			
			
			
		} else if (path.equals("Logout.do")) {
			
			com = new Logout();
			
			
		} else if (path.equals("SelectAll.do")) {

			com = new SelectAll();
		}

		// 중복코드3.
		finalPath = com.excute(request, response);

		
		
		// 중복코드2. 최종적으로 이동하는 경로
		if(finalPath.contains("redirect:/")) {
			// ex) redirect:/Main
			// substring or replace or replaceAll or split 등등
			// 다양한 String method를 사용하여 문제 해결 가능
			response.sendRedirect(finalPath.split("/")[1]+".jsp");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(finalPath+".jsp");
			rd.forward(request, response);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private String selectAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
