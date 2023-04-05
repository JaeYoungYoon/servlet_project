<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<style type="text/css">
	table {
		margin: 0 auto;
	}
	</style>
	<link rel="stylesheet" href="../css/style_ys.css" />
</head>

<body>

	<%@ include file="top.jsp"%>


	<section>
		<div class="TEAMWORK">

		
			<h1>골프 연습장 회원관리 시스템</h1><br/><br/>
					
					
			<table width="500" cellpadding="0" cellspacing="0" border="1">
			<form action="register.jsp" method="post">
			<label for="REGIST_MONTH">수강월:</label>
			<input type="text" id="usermonth" name="usermonth" required>2022년03월 예)202203<br><br>
			
			<label for="C_NAME">회원명:</label>
			<select id="guestname" name="guestname">
			<option value="NAME">회원명</option>
			<option value="Hong">홍길동</option>
			<option value="Jang">장발장</option>
			<option value="Im">임꺽정</option>
			<option value="Chun">성춘향</option>
			<option value="Dragon">이몽룡</option>
			
			</select><br><br>
		
			<label for="C_NO">회원번호:</label>
			<input type="text" id="guestNum" name="guestNum" required><br><br>
			
			<label for="CLASS_AREA">강의장소</label>
			<select id="CLASS_AREA" name="guestname">
			<option value="10001">장소</option>
			<option value="10002">서울본원</option>
			<option value="10003">대전분원</option>
			<option value="20001">부산분원</option>
			<option value="20002">대구분원</option>
			</select><br><br>

		
		<label for="name">수강료</label>
		<input type="text" id="name" name="name" required>원<br><br>
		
		<input type="submit" value="수강신청">
		<input type="reset" value="다시쓰기">
		
		</form>
		</table>
		</div>


	</section>


	<%@ include file="bottom.jsp"%>
</body>
</html>