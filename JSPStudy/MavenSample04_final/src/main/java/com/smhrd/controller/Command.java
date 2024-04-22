package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	
	// FrontController --> 자원을 많이 차지하는 / 실생활 : 돈을 많이 받는 매니저
	// Join, Login, SelectAll, Logout --> 자원을 적게 차지하는 일반클래스 / : 아르바이트생
	// Command --> 메뉴얼 / 규격
	// Interface는 추상메소드만 가질 수 있디
	// abstract 생략가능
	public String execute(HttpServletRequest request, HttpServletResponse response);

}
