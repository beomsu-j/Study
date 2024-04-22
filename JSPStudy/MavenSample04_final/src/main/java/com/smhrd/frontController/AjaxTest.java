package com.smhrd.frontController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.google.gson.Gson;
import com.smhrd.model.MemberVO;

@WebServlet("/Ajax")
public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 출력해줄 때 한글인코딩 잡는방법
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("요청이 들어옴");
		
		String data = request.getParameter("sendData");
		System.out.println("데이터 확인 >> " + data);
		
		// DAO 사용해서 DB 데이터 조회한 상태라고 가정하기
		// 조회 성공
		// 결과값을 반환
		// ★★★★ 비동기통신을 통해서 결과값을 반환하기 위해서는 화면에 반환하고 싶은 데이터가 출려괴면 된다
		// 1) 출력객체 꺼내오기
		PrintWriter out = response.getWriter();
		// 2) 출력해주기
		// * 돌려줘야하는 데이터가 여러개였을때 *
		MemberVO vo = new MemberVO();
		vo.setEmail("admin");
		vo.setTel("01012345678");
		vo.setAddress("광주광역시");
		
		// java객체를 js에서 사용하능한 객체로 변환
		// == json 형태로의 변환이 필요
		
		// 변환하는 도구 꺼내오기(라이브러리)
		Gson gson = new Gson();
		// 도구 사용하기
		String json = gson.toJson(vo);
		
		out.print(json);
		
		
		
		
		
		
	}

}
