package com.test.FrontController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.database.DAO;
import com.test.model.MemberVO;
import com.test.model.ReserveVO;

@WebServlet("/RsvCommit")
public class RsvCommit extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        
        // 세션에서 회원 정보 가져오기
        MemberVO membervo = (MemberVO) request.getSession().getAttribute("member");
        if (membervo == null) {
            // 세션이 없는 경우 로그인 페이지로 리다이렉트 등의 처리를 수행할 수 있음
            response.sendRedirect("login.jsp");
            return;
        }
        String mem_id = membervo.getMem_id();
        System.out.println("아이디 : " + mem_id);

        // 클라이언트로부터 전송된 JSON 데이터 읽기
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        StringBuilder jsonData = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonData.append(line);
        }
        reader.close();

        // JSON 데이터 파싱
        ObjectMapper mapper = new ObjectMapper();
        ReserveVO[] reservations = mapper.readValue(jsonData.toString(), ReserveVO[].class);
        
        // 예약 정보 처리
        if (reservations != null && reservations.length > 0) {
            DAO dao = new DAO();
            for (ReserveVO reservation : reservations) {
                dao.RsvCommit(mem_id, reservation.getPt_idx(), reservation.getCreated_at(), reservation.getRes_status());
            }
            response.getWriter().println("예약이 완료되었습니다.");
        } else {
            response.getWriter().println("예약할 항목이 선택되지 않았습니다.");
        }
    }
}