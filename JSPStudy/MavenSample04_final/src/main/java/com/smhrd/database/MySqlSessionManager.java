package com.smhrd.database;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionManager {

	// mybatis-config.xml 파일을 읽어서
	// Connection 객체(==SqlSession)을 빌려줄 준비를 하는 객체
	// 실수로 수정하는것을 방지하기 위해 따로 만듦.
	private static SqlSessionFactory sqlSessionFactory;
	
		public static SqlSessionFactory getSqlSessionFactory() {
			return sqlSessionFactory;
		}

	// static >> 제일 먼저 읽혀지는 저장곤간, 고정적인 저장공간
	// MySqlSessionManager 클래스 파일을 부르는 순간, 바로 실행되는 공간
	static {
		
		// 자동 import 단축키 >> ctrl shift o
		String resource = "com/smhrd/database/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
