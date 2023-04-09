<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<link rel="stylesheet" href="../css/style.css">
</head>

<body>

	<%@ include file="topmenu.jsp"%>


	<section>

		<h1>골프 연습장 회원관리 시스템</h1>

		<div>
			<ul>
				<li>로컬 호스트의 연결에 이어주는 메인 센터 부분이자,<br> 홈 배너 역할을 하는 jsp이다.</li>
				<li>연결해 놓은 페이지는 MainGolf2.jsp 검색은 list.do로 연결되어있다.</li>
				<li>각 항목은 강사조회(teacher.jsp), 수강신청(createacount.jsp),<br>
					회원정보조회(guest.jsp), 강사매출 현황 (class.jsp) 페이지로 이어져있다.</li>
			</ul>

		</div>
	</section>


	<%@ include file="footer.jsp"%>
</body>
</html>