<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">

</head>

<body>
	<%@ 
include file="topmenu.jsp"%>
	<section class="main">

		<h1>코딩하자</h1>
		<div>
			<h3>페이지 구조</h3>
			<ul>
				<li>JSP 파일로 뼈대를 만들고 VO파일로 객체 정의</li>
				<li>DAO로 쿼리문 정의하고 CONTROLLER로 COMMAND 관리</li>
				<li>COMMAND는 INTERFACE를 상속받아 VO와 DAO 객체 호출</li>
				<li>웹페이지 호출</li>
			</ul>

		</div>
		<div>
			<h3>페이지 내용</h3>
			<ul>
				<li>후보조회</li>

				<li>투표하기</li>

				<li>투표검수조회</li>

				<li>후보자등수</li>
			</ul>
		</div>

	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>