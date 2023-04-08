<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="../css/style.css">
</head>

<body>

	<%@ include file="topmenu.jsp"%>


	<section>

		<h1>수강신청</h1>

		<form action="Guest.jsp" method="post">
			<table>
				<tr>
					<td><label for="regist_month">수강월:</label></td>
					<td><input type="text" maxlength="6" name="regist_month" required
						placeholder="202203"></td>
				</tr>
				<tr>
					<td><label for="c_name">회원명</label></td>
					<td><select name="c_name">
							<option value="10001">홍길동</option>
							<option value="10002">장발장</option>
							<option value="10003">임꺽정</option>
							<option value="20001">성춘향</option>
							<option value="20002">이몽룡</option>
					</select></td>
				</tr>
				<tr>
					<td><label for="c_no">회원번호</label></td>
					<td><input type="text" name="c_no" placeholder="10001"></td>
				</tr>
				<tr>
					<td><label for="class_area">강의장소</label></td>
					<td><select name="class_area">

							<option value="서울본원">서울본원</option>
							<option value="대전본원">대전분원</option>
							<option value="부산본원">부산분원</option>
							<option value="대구본원">대구분원</option>
					</select></td>
				</tr>
				<tr>
					<td><label for="tuition">수강료</label></td>
					<td><input type="text" name="tuition" placeholder="100000(원)"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button class="btn" type="submit">수강신청</button>
						<button class="btn" type="reset">리셋하기</button>
				</tr>
			</table>
		</form>


	</section>


	<%@ include file="footer.jsp"%>
</body>
</html>