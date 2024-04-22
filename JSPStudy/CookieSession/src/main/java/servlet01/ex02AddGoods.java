package servlet01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddGoods")
public class ex02AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
// --> servlet을 생성할 때 url mapping을 잡아주면 좋은점
// --> / 가 없으면 다음 패아자로 넘어가지 않기 때문에 내 실수를 방지 할 수 있다

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Cookie cookie = new Cookie("test","test");
		// response.addCookie(cookie); 문제 없음

		// 쿠키 지우기
		// 쿠키데이터 전부 꺼내오기
		// 쿠키들중 name이 product로 시작되는 데이터들만
		// ->setMaxAge(0)
		
		// 1.체크박스를 누르고 담기 누르면 이 서버로 체크 데이터를 이동
		// ->shop.jsp에서 폼태그에 action 만들어야함

		// 2. 요청받은 데이터를 꺼내주기
		String[] product = request.getParameterValues("product");
		// request.getParameterValues("") 여기다가 shop.jsp의 네임값을 가져와야함

		// 3. 요청받은 데이터의 개수만큼 쿠키 생성
		for (int i = 0; i < product.length; i++) {
			Cookie cookie = new Cookie("product" + (i + 1), product[i]);
			// name 값은 중복 불가능
			
			// 유효기간 만들기
			cookie.setMaxAge(124700);
			// 4. 요청받은 데이터의 개수만큼 쿠키 보내주기
			response.addCookie(cookie);
		}

		// 5. shop.jsp페이지로 이동
		// **redirect(요청 2번 응답 2번) url 의 변화 
		// vs 
		// forward(요청 1번 응답 1번) ** 
		response.sendRedirect("Shop.jsp");
				
	}

}
