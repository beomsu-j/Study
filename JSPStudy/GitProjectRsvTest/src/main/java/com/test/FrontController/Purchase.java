package com.test.FrontController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.database.DAO;
import com.test.model.MemberVO;
import com.test.model.PurchaseVO;

@WebServlet("/Purchase")
public class Purchase extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        
        MemberVO membervo = (MemberVO) request.getSession().getAttribute("member");
        String mem_id = membervo.getMem_id();
        System.out.println("아이디 : " + mem_id);
        
        // AJAX 요청으로부터 값 가져오기
        String vc_idxs = request.getParameter("get_vc_idx");
        System.out.println(vc_idxs);
        if (vc_idxs != null && !vc_idxs.isEmpty()) { 
            String[] get_vc_idx = vc_idxs.split(","); 
            System.out.println(get_vc_idx);
            DAO dao = new DAO();
            for (String idx : get_vc_idx) {
                int vc_idx = Integer.parseInt(idx);
                PurchaseVO vo = new PurchaseVO(mem_id, vc_idx);
                dao.insert_Purchase(vo);
                System.out.println(vo);
            }
        } else {
            System.out.println("get_vc_idx 매개변수가 null이거나 비어 있습니다.");
        }
    }
}
