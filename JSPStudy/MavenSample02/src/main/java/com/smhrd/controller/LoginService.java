package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 한글인코딩
		request.setCharacterEncoding("utf-8");
		// 2. 요청데이터 꺼내오기 2개
		String email =request.getParameter("email");
		String pw = request.getParameter("pw");
		System.out.println("가져온 데이터 >> "+ email+pw);
		
		// 3. 요청데이터 하나로 묶어주기
		MemberVO vo = new MemberVO();
		vo.setEmail(email);
		vo.setPw(pw);
		// 4. dao생성
		DAO dao = new DAO();
		
		// 5. dao안에 있는 로그인 기능 사용
		MemberVO resultvo = dao.login(vo);
		
		if(resultvo != null) {			
			// 6. 로그인 성공 -> main.jsp -> session에 저장
			// 6-1 로그인 성공 -> 세션 회원정보를 장
			HttpSession session = request.getSession();
			// 6-2 세션 데이터 저장하기
			session.setAttribute("member",resultvo);
		}
			// main.jsp페이지로 redirection으로 전송
			response.sendRedirect("main.jsp");
		
	}

}
