<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<input type="text" id="data">
	<button class="btn">데이터 전송</button>

	<!--
		1) jquery 라이브러리 가져오기 ( <head>태그 안에 써도됨 )
	 -->
	<script src="assets/js/jquery.min.js"></script>

	<script type="text/javascript">
		// js코드를 작성할 수 있는 공간

		// jquery 문법 기준
		// 1) 버튼 태그를 DOM형식으로 가져와서 클릭했을 때 이벤트 등록
		$(".btn").on("click", function() {
			// 2) 클릭했을 때, input태그를 DOM형식으로 가져와서 안쪽에 입력된 글자 꺼내오기
			let sendData =$("#data").val();
			
			// let sendData = {
			//		"sendData" : $("#data").val();
			//}
		
			// 3) console에 출력하기
			console.log(sendData);
			// 4) 비동기통신(ajax)을 사용하여 Servlet으로 데이터 전송
			$.ajax({
				// 보내줄 url
				url : "Ajax",
				// 보내줄 데이터 : 객체 형식으로 보내기 {"키" : 밸류}
				data : {"sendData" : sendData },
				// 전송방식 지정
				// 반드시 소문자로 작성
				type : "get",
				
				//결과값 자료형 지정
				dataType : "json",
				// 성공했을 때, 실행 할 함수 지정
				success : (res) =>{
					console.log("데이터 전송 성공!");
					console.log("받아온 데이터 >> ", res.email);
					console.log("받아온 데이터 >> ", res);
				},
				// 실패했을 때, 실행 할 함수
				error : () =>{
					console.log("데이터 전송 실패!");
					
				}
				
				
			})
		})
		function submit() {

			String
			text = document.getElmentByid("txt").value;
			console.log(String);

		}
	</script>

</body>
</html>