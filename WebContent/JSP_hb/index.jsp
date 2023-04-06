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
	<section>

		<h1>코딩하자</h1>
		<p>
			JSP 파일로 뼈대를 만들고 VO파일로 객체 정의<br> DAO로 쿼리문 정의하고 CONTROLLER로
			COMMAND 관리<br> COMMAND는 INTERFACE를 상속받아 VO와 DAO 객체 호출<br>
			웹페이지 호출
		</p>

		<ul>
			<li>후보조회</li>

			<li>투표하기</li>

			<li>투표검수조회</li>

			<li>후보자등수</li>
		</ul>

	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>