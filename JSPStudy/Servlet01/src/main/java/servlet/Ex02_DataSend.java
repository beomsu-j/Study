package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02_DataSend")
public class Ex02_DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터를 처리하거나 페이지를 이동하기 위해 사용되는 공간
		
		// 데이터 가져오기 -> getparameter() -> 반환타입은 String 타입이다
		String result = request.getParameter("data");
		
		//--> 콘솔 System.out.println("data : "+ result);
		
		// 한글에 대한 응답을 위한 인코딩 작업
		response.setContentType("text/html; charset=utf-8");
		
		// 넘어오는 데이터를 실제 화면에 띄우기
		PrintWriter out = response.getWriter();
		out.print(result);
	}

}
