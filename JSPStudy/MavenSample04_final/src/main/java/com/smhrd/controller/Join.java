package com.smhrd.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

public class Join implements Command {

	// Interface로 대체
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		


		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		MemberVO vo = new MemberVO(email, pw, tel, address);
		DAO dao = new DAO();
		int row = dao.join(vo);
		
		if (row > 0) {
			request.setAttribute("email", email);
			// foward 방식으로 이동
			return "join_success";
		} else {
			// redirect로 이동할때는 약속기호를 앞쪽에 붙이기
			// redirect:/ >> 우리만의 약속기호! 다른걸로 바꿔도 상관없음
			return "redirect:/gomain.do";
		}
		// .jsp 확장자도 frontController에서 처리해주기 위해 삭제함
	}

}
