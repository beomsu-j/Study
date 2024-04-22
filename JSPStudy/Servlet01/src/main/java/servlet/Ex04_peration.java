package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04_peration")
public class Ex04_peration extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int data1 = Integer.valueOf(request.getParameter("data1"));	
		int data2 = Integer.parseInt(request.getParameter("data2"));
		// 선택한 연산자 데이터 꺼내오기
		String op = request.getParameter("op");
		// 연산에 따라 해당 연산을 진행할 수 있는 로직
		int result=0;
		if(op.equals("+")) {
			result = data1+data2;
		}else if(op.equals("-")) {
			result = data1-data2;
		}else if(op.equals("*")) {
			result = data1*data2;
		}else{
			result = data1/data2;
		}
		
		// 결과 값 입력
		PrintWriter out = response.getWriter();
		out.print(result);
		
	}

}
