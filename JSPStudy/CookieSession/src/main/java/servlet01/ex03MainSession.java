package servlet01;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MainSession")
public class ex03MainSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 세센을 생성하는 역할은 서버에서 자동으로 진행한다.
		
		// 1. session 가져오기
		HttpSession session = request.getSession();
		
		// 2. session 안에 있는 데이터를 저장하기 
		ArrayList<String> list = new ArrayList<String>();
		list.add("조범수");
		
		session.setAttribute("testSession", list);
		// Object value = list;
		// Object value = new ArrayList<String>(); -> *up-casting*
	
	
		// 3. Ex02_GetSession.jsp로 redirect 방식 사용
		response.sendRedirect("Ex02_GetSession.jsp");
	
		// 4. Session을 삭제하는 방법
		// session.invalidate();
		// -> 모든 데이터를 삭제하는게 일반적이므로 위의 코드 사용하기
		// session.removeAttribute("name");
		
		//-----------------------------------------------//
		
		// 쿠키(장바구니 데이터 / 트랙킹)
		// 저장위치 : 웹 브라우저(Client)
		// 저장가능한 자료형 : String 자료형
		// 생명주기 : 지정한 생명만큼 유지
		// 보언성 : 세션보다는 떨어짐
		// 속도 : 빠름 
		//          vs
		// 세션(로그인 정보 유지)
		// 저장위치 : 서버(Server)
		// 저장가능한 자료형 : 모든 자료형
		// 생명주기 : 브라우저가 종료되기 전까지 유지
		// 보언성 : 쿠키보다는 좋음
		// 속도 : 느림 
		// ** 세션을 너무 많이 사용하다보면 서버 속도가 많이 느려짐
		
	}

}
