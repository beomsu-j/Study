package com.smhrd.model;

public class MemberVO {

	// 1. 필드
	// >> 필드명도 테이블의 컬럼과 일치시키자
	private String email;
	private String pw;
	private String tel;
	private String address;
	
	
	
	// 2. 메소드
	// 기본 생성자, 모든 필드 값을 초기화 시킬수있는 생성자
	// alt shift s
	
	// 모든 필드 값을 초기화 시킬수있는 생성자
	public MemberVO(String email, String pw, String tel, String address) {
		
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}
	
	// 기본 생성자
	public MemberVO() {
		
	}
	
	// 케터세터
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
