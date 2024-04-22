package com.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.db.BoardMapper;
import com.smhrd.model.BoardVO;
import com.smhrd.model.SearchCriteria;

@RestController // @Controller + @ResponseBody 기능
public class BoardRestController {
	// Rest는 Representational State Tranfer 의 약자
	// 비동기 통신으로 요청이 들어왔을 때 처리해주는 역할
	@Autowired
	private BoardMapper mapper;
	
	///////////////////////////////////////////////////////////////////////////////////////////

	
	// 자동완성 기능
	@RequestMapping("/autocomplete")
	public List<BoardVO> autocomplete(SearchCriteria criteria) {
	// 리턴 타입이나 매개변수의 자료형은 자유롭게 설정
	// -> 내가 꺼내오기 편한 자료형으로 지정하는것이 좋다
		List<BoardVO> result = mapper.autocomplete(criteria);

		return result;
	}

	///////////////////////////////////////////////////////////////////////////////////////////

	// 비동기 통신으로 검색하는 기능
	@RequestMapping("/search")
	// -> 화면에서 띄울수 있게 되서
	public List<BoardVO> search(SearchCriteria criteria) {
		List<BoardVO> list = mapper.search(criteria);
		return list; // 리턴 된 값이 화면에 출력
		// 현재 list에는 주소값이 담겨져 있다. 우리가 비동기 통신으로 보내줘야하는 데이터는 json 구조이다
		// 주소값 -> 변환 -> json
		// 변환을 spring 에서 자동으로 진행 (변환용 라이브러리가 하나 필요)
	}

	///////////////////////////////////////////////////////////////////////////////////////////

}
