package com.smhrd.database;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.model.MemberVO;

public class DAO {

	// Data Access Object
	// 데이터에 접근하는 객체
	
	// 필드 영역
	// DBCP 꺼내오기
	// factory == connection 객체들을 가지고 있는 공간
	private SqlSessionFactory factory = MySqlSessionManager.getSqlSessionFactory();
	
	
	public int join(MemberVO vo) {

		// 1. 연결 객체 빌려오기
		SqlSession session = factory.openSession(true);
		// 2. 연결객체 사용하기
		// *공통*
		// 매개변수 한개 >> Mapper파일의 sql구문 id 값
		// 매개변수 두개 >> id값, 보내줘야하는 데이터
		// session.insert() : insert 구문
		// session.delete() : delete 구문
		// session.update() : update 구문
		// session.selectone() : select 구문인데 데이터가 1개일때
		// session.select() : select 구문인데 데이터가 여러 개일 때
		int row = session.insert("join", vo);
		// 3. 연결객체 반납하기
		session.close();
		
			
		return row;
	}
	public MemberVO login(MemberVO vo) {

		// 1. 연결 객체 빌려오기
		SqlSession session = factory.openSession();
		// 2. 연결객체 사용하기
		// *공통*
		// 매개변수 한개 >> Mapper파일의 sql구문 id 값
		// 매개변수 두개 >> id값, 보내줘야하는 데이터
		// session.insert() : insert 구문
		// session.delete() : delete 구문
		// session.update() : update 구문
		// session.selectone() : select 구문인데 데이터가 1개일때
		// session.select() : select 구문인데 데이터가 여러 개일 때
		MemberVO resultvo = session.selectOne("login", vo);
		// -> select기능을 수행하고 난 결과 자료형은 제네릭 기법으로 결정된다
		// 제네릭 기법이란
		// : 클래스 내부에서(sqlSession) 사용해야하는 자료형을 클래스 외부에서 결정하는 기법
		
		// 3. 연결객체 반납하기
		session.close();
		
		// 4. 결과값 반환	
		return resultvo;
	}
	
	public List<MemberVO> selectAll() {

		// 1. 연결 객체 빌려오기
		SqlSession session = factory.openSession();
		
		// 2. 연결객체 사용
		List<MemberVO> resultList = session.selectList("selectAll");
		// MemberVo 회원 1명에 대한 정보
		// 우리가 필요한 것 여러명 -> 몇명인지는 모름
		// MemberVO 하나로 묶어서 표현하는 자료구조 중에 가변적인 >> ArrayList >> List
		// List란?
		// --> ArrayList의 상위 클래스
		// --> 더 추상적인 클래스
		//** collection 구조 **
		
		// 3. 연결객체 반납하기
		session.close();
		
		// 4. 결과값 반환	
		return resultList;
	}
	
	
}
