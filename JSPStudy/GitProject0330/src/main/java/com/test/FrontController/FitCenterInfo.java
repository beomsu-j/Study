package com.test.FrontController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.test.database.DAO;
import com.test.model.FitnessCenterVO;


@WebServlet("/FitCenterInfo")
public class FitCenterInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		String trn_name = request.getParameter("trn_name");
		
		DAO dao = new DAO();
		FitnessCenterVO fitvo = dao.fit_center(trn_name);
		
		PrintWriter out = response.getWriter();
	        
	        
	        
		Gson gson = new Gson();
			
		String json = gson.toJson(fitvo);
			
		out.print(json);
	}

}
