package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	 
	// FrontController --> 자원을 많이 차지하는 / 돈을 많이 받아야하는 매니저
	// Join,SelectAll,Login,Logout -> 일반클래스 / 자원을 적게 차지하는 / 아프바이트생
	// Command Interface-> 메뉴얼 / 규격
	
	public String excute(HttpServletRequest request, HttpServletResponse response);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
