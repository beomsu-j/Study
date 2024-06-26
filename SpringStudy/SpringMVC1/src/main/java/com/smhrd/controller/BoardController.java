package com.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.smhrd.db.BoardMapper;
import com.smhrd.model.BoardVO;

// Spring F/W 흐름
// (1) Dispatcher Servlet(Front Controller) 요청을 받는다.
// (2) Handler Mapping 에게 요청값(요청 URL)을 보낸다
// (3) Handler Mapping 요청값과 일피하는 Controller 를 Spring Container 에서 찾는다
// (4) Handler Adapter 가 HM이 찾은 Controller 실행

// 해당하는 클래스 파일이 Spring Container(SC) 안에 자동으로 생성될 수 있게 만들고,
// Controller 임을 명시하는 어노테이션
@Controller // 기능이 정의되어 있음
public class BoardController {
	
	@Autowired // 엄청 중요 ㅎ
	private BoardMapper mapper;
	// @Autowired
	// : 자동으로 연결해줘
	// : Spring Container 에서 mapper를 구현한 구현테를 자동으로 연결해준다.
	
	
	// 글 삭제 기능
	@GetMapping("/boardDelete/{idx}")
	public String boardDelete(@PathVariable("idx") int idx) {	
		
		mapper.boardDelete(idx);
		
		return "redirect:/";
	}
	
	

	
	// 글 상세조회 기능
	// 경로상에 데이터를 직접적으로 보내주는 경우에 사용할 수 있는 기능
	// ("/경로/{받아줄 데이터이름}")
	// 매개변수 안 쪽에 (@PathVariable("받아줄 데이터 이름") 자료형 변수명)
	@GetMapping("/boardContent/{idx}")
	public String boardContent(@PathVariable("idx") int idx, Model model) {
	    
	    System.out.println("수집한 데이터 >> "+ idx);
	    
	    BoardVO result = mapper.boardContent(idx);
	    
	    model.addAttribute("board",result);
	    
	    return "content";
	}

	
	
	
	
	
	// 글쓰기 기능을 하는 메소드 생성
	@PostMapping("/register") // -> post 전송방식일때만 메소드 실행
	public String register(BoardVO vo) {
		// 1. 요청데이터 수집
		// --> Spring이 알아서 해줌
		// 메소드의 매개변수로 수집하고 싶은 자료형을 지정해주기만 하면 된다
		// *** vo 필드명 == 보내주는 name 값 == table의 컬럼명 일치좀 해줘 제발
		
		System.out.println(vo);
		//  주소값 안나오고 안에 저장되어있는 데이터 출력
		// -> @Data >> getter, setter, toString method override
		// toString method?
		// >> 객체의 주소값을 출력하는 대신에, 안쪽에 있는 데이터 출력을 도와주는 Object 메소드
				
		// 2. mapper 수집
		mapper.register(vo);
		// 3. 경로이동
		return "redirect:/";
		// "/" 라는 경로로 이동하겠다 
		// -> board메소드 실행 -> boardList 조회 -> 결과값 model -> board로 이동
	}
	
	
	@GetMapping("/register")
	// 글쓰기 페이지로 이동하는 메소드
	public String register() {
		return "register";
	}
	
	
	
	
	// Spring F/W 는 url mapping 값을 메소드 단위로 설정함
	@RequestMapping("/") // -> "/" 요청이 들어왔을 때 board 메소드 실행
	public String board(Model model) {
		// model을 가져오눈 방법
		// --> 메소드의 매개변수로 해당하는 객체를 작성
		// --> SC가 자동으로 객체를 채워줌

		// 2. DAO 사용해서 결과값 받아오기
		List<BoardVO> list = mapper.boardList();
		// 3. 받아온 결과값 model 영역에 담아주기
		// model 이란? -> request 의 경량화된 버전
		model.addAttribute("list", list);
		// 4. board.jsp로 forward 방식으로 이동하기
		return "board";
		// board -> 논리적인 주소값
		// WEB-INF/views/board.jsp --> 물리적인 주소값
		// 논리적인 주소값을 물리적인 주소값으로 자동으로 변환해주는 View Resolver 객체가 이미 존재
		// ViewResolver의 역할은? (확인해보고 싶다면 servlet-context.sml 보기)
		// WEB-INF/views/ + 리턴 값 + .jsp

	}

}
