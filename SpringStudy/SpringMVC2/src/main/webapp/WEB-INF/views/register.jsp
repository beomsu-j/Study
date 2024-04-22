<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
/* Jumbotron 스타일 수정 */
.jumbotron h1 {
	color: white; /* 글씨색을 흰색으로 변경 */
}

.jumbotron p {
	color: white; /* 글씨색을 흰색으로 변경 */
}

.jumbotron {
	background-color: darkgray;
}
/* Card 스타일 수정 */
.card-header {
	background-color: darkgray; /* 배경색을 짙은 회색으로 변경 */
	color: white; /* 글씨색을 흰색으로 변경 */
}

.table table-border table-hover {
	background-color: whitesmoke;
}
#content {
  background-attachment: local;
  background-image:
    linear-gradient(to right, white 10px, transparent 10px),
    linear-gradient(to left, white 10px, transparent 10px),
    repeating-linear-gradient(white, white 30px, #ccc 30px, #ccc 31px, white 31px);
  line-height: 31px;
  padding: 5px 10px;
}
</style>
</head>
<body>
	<div class="jumbotron">
		<h1>빅데이터 23차 게시판</h1>
		<p>화이팅 잠은 죽어서 자자 눈깔 뒤짚어진다</p>
	</div>
	<div class="container">
		<div class="card">
			<div class="card-header">게시글 등록</div>
			<div class="card-body">
				<form action="${cpath}/register" method="post">
					<div class="form-group">
						<label for="title">제목:</label> 
						<input name="title" type="text" class="form-control" id="title" placeholder="제목 입력">
					</div>
					<div class="form-group">
						<label for="writer">작성자:</label>
						 <input name="writer" type="text" class="form-control" id="writer" placeholder="작성자 입력">
					</div>
					<div class="form-group">
						<label for="content">내용:</label> 
						<textarea name="content" class="form-control" rows="10" id="content" placeholder="내용을 입력해주세요"></textarea>
					</div>
					<button type="submit" class="btn btn-primary">작성하기</button>
				</form>
			</div>
		</div>
	</div>







</body>
</html>