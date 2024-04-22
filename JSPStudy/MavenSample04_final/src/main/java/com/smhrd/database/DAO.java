package com.smhrd.database;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.model.MemberVO;

public class DAO {

	// Data Access Object
	// 데이터에 접근하는 객체

	// 1. 필드
	// DBCP 꺼내오기
	// factory == Connection 객체들을 가지고 있는 공간
	SqlSessionFactory factory = MySqlSessionManager.getSqlSessionFactory();

	public int join(MemberVO vo) {

		// 1. 연결객체 빌려오기
		SqlSession session = factory.openSession(true);
		// 2. 연결객체 사용
		// *공통*
		// 매개변수 한개 >> Mapper파일의 sql구문 id값
		// 매개변수 두개 >> id값, 보내줘야하는 데이터

		// session.insert() : insert구문
		// session.delete() : delete구문
		// session.update() : update구문
		// session.selectOne() : select구문, 가져와야하는 데이터가 하나의 행일 때,
		// session.selectList(): select구문, 가져와야하는 데이터가 여러개의 행일 때,
		int row = session.insert("join", vo);
		// 3. 연결객체 반납하기
		session.close();

		return row;
	}

	// 2. 로그인 기능
	public MemberVO login(MemberVO vo) {

		// 1. 연결객체 빌려오기
		SqlSession session = factory.openSession(true);

		// 2. 연결객체 사용하기 >> select >> 데이터가 한개
		MemberVO resultVo = session.selectOne("login", vo);
		// --> select기능을 수행하고 난 결과 자료형은 제네릭 기법으로 결정된다.
		// 제네릭 기법이란?
		// : 클래스 내부에서 사용해야하는 자료형을 클래스 외부에서 결정하는 기법

		// 3. 연결객체 반납
		session.close();

		// 4. 결과값 반환
		return resultVo;

	}

	public List<MemberVO> selectAll() {

		// 1. 연결객체 생성하기.
		SqlSession session = factory.openSession(true);

		// 2. 연결객체 사용하기
		List<MemberVO> resultList = session.selectList("selectAll");
		// MemberVO = 회원 1명에 대한 정보
		// 우리가 필요한건? 회원 여러명에 대한 정보 --> 몇명인지 알 수 없다
		// MemberVO 하나로 묶어서 표현하는 자료구조 중에 가변적인 구조 ? >>
		// : ArrayList < list
		// list란?
		// --> ArrayList의 상위 클래스
		// --> 더 추상적인 클래스
		// ** Collection 구조

		// 3. 연결객체 반환하기
		session.close();

		return resultList;
	}

	public void update(MemberVO vo) {
		
		// 1. 세션 빌려오기
		SqlSession session = factory.openSession(true);
		// 2. 세션 사용하기
		session.update("update", vo);
		// 3. 세션 반납하기
		session.close();
	}

	public String check(String email) {
		
		// 1. 세션 빌려오기
		SqlSession session = factory.openSession(true);
		
		// 2. 세션 사용하기 --> select구문 데이터 한개만 조회
		String result = session.selectOne("check", email);
		// 3. 세션 
		session.close();
		
		return result;
	}

	
	
	

}
