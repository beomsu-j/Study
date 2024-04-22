
// 페이지가 첫 번째로 실행되었을 때, autocomplete되게 만들기
$(function() {
	myAjaxAutocomplete();
})

// select 값이 변경 되었을 때 이벤트 처리
$("#sel1").on("change", function() {
	myAjaxAutocomplete()
})


// 비동기 통신을 사용하여 작성자 리스트를 전부 조회
// 요청경로: /autocomplete	
function myAjaxAutocomplete() {
	$.ajax({
		url: `${cpath}/autocomplete`,
		data: { type: $("#sel1").val() },
		dataType: "json",
		success: function(res) {
			console.log(res);
			var sourceList = [];
			for (var i = 0; i < res.length; i++) {
				if (res[i].writer != null) {
					sourceList.push(res[i].writer);
				} else {
					sourceList.push(res[i].title);
				}
			}
			myAuto(sourceList);
		},
		error: function(e) {
			console.log(e);
		}
	})
};


function myAuto(sourceList) {
	// Jquery-ui를 사용해서 input태그 아래쪽에 글자 자동완성 기능 넣어보기
	$("#auto_complete").autocomplete({
		// 1. 자동완성하고 싶은 목록
		source: sourceList,
		// 2. 최소글자
		minlength: 1,
		// 3. 딜레이
		delay: 100,
		// 4. 해당 요소에 focusing 됐을 때 작동할 함수
		focus: function(e, ui) {
			// e--> event
			// ui --> 화면구성
			return false;
		}
	})
}



// 1. searchBtn을 클릭했을 때 이벤트 등록
$("#searchBtn").on("click", function() {


	// 2. id 값이 searchForm 안에 있는 데이터를 가져오기
	var data = $("#searchForm").serialize();
	// 3. 가져온 데이터 출력
	console.log(data);
	// 4. 비동기 통신을 사용하여 데이터 전송(/search)
	$.ajax({
		url: `${cpath}/search`,
		data: data,
		dataType: "json",
		success: function(result) {

			// 1. 컬럼 이름을 제외한 나머지 행들을 비워주기
			$("#myTable tr:first-child~tr").empty();
			// 2. result의 담긴 데이터 개수만큼 반복
			$("#myTable tr:not(:first-child)").remove();
			$.each(result, function(i, board) {
				// 3. tr태그 추가
				var tr = `<tr>
								<td>${i + 1}</td>
								<td>									
									<a href="${cpath}/boardContent/${board.idx}">${board.title}</a>
								</td>
								<td>${board.writer}</td>
								<td>${board.indate}</td>
							</tr>`
				$('#myTable').append(tr);


			});



		},
		error: function(e) {
			console.log(e)
		}
	})
})
