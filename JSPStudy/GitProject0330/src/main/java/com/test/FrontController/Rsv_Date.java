package com.test.FrontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.test.database.DAO;
import com.test.model.PersonalTrainingVO;


@WebServlet("/Rsv_Date")
public class Rsv_Date extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String trn_idx = request.getParameter("trn_idx");

        System.out.println(trn_idx);

        if (trn_idx != null && !trn_idx.isEmpty()) {
            String[] get_trn_idx = trn_idx.split(",");
            System.out.println(get_trn_idx);
            DAO dao = new DAO();
            for (String idx : get_trn_idx) {
                int trnidx = Integer.parseInt(idx);
                ArrayList<PersonalTrainingVO> vo = dao.PT(trnidx);                
                System.out.println(vo);
                Gson gson = new Gson();

                String json = gson.toJson(vo);

                out.print(json);
            }
        } else {
            System.out.println("trn_idx 매개변수가 null이거나 비어 있습니다.");
        }
    }
}

