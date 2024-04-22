package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

public class EmailCheck implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		// 1. 요청 데이터 꺼내오기 (1)
		String email = request.getParameter("email");
		
		// 2. DAO 생성하기
		DAO dao = new DAO();
		
		// 3.dao.check() 기능 사용하기
		String result = dao.check(email);
				
		// 4. 결과값 반환
		try {
			// try-catch가 필요한 이유는?
			// response.getWriter() 메소드 안에, IOExecption을 사용하려면
			// 예외처리를 해야하는데, 이것은 처리하기위해서는 Throws 또는 try-catch 문을 사용해야한다
			// 메소드에 throws를 하는경우, 인터페이스가 성립이 안되기떄문에 try-catch를 사용한다
			response.getWriter().print(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 비동기는 화면의 전환이 일어나지 않아, 경로를 반환해줄필요없음
		return null;
	}

}
