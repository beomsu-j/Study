package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

public class Login implements Command {

	public String excute(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		System.out.println("가져온 데이터 >> " + email + pw);

		MemberVO vo = new MemberVO();
		vo.setEmail(email);
		vo.setPw(pw);
		DAO dao = new DAO();

		MemberVO resultvo = dao.login(vo);

		if (resultvo != null) {

			HttpSession session = request.getSession();
			session.setAttribute("member", resultvo);
		}
		return "redirect:/main";

	}
}
