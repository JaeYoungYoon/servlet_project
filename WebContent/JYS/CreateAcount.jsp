<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" href="../css/style_ys.css" />
</head>

<body>

	<%@ include file="top.jsp"%>


	<section>
		<div class="TEAMWORK">


			<h1>수강신청</h1>

			<form action="action.jsp" method="post">
				<table width="500" cellpadding="0" cellspacing="0" border="1">
					<tr>
						<td><label for="regist_month" maxlength="6">수강월:</label></td>
						<td><input type="text" name="regist_month" required>
							2022년03월 예)202203</td>
					</tr>
					<tr>
						<td><label for="c_name">회원명</label></td>
						<td><select name="c_name">
								<option value="">회원명</option>
								<option value="10001">홍길동</option>
								<option value="10002">장발장</option>
								<option value="10003">임꺽정</option>
								<option value="20001">성춘향</option>
								<option value="20002">이몽룡</option>
						</select></td>
					</tr>
					<tr>
						<td><label for="c_no">회원번호</label></td>
						<td><input type="text" name="c_no">예)10001</td>
					</tr>
					<tr>
						<td><label for="class_area">강의장소</label></td>
						<td><select name="class_area">
								<option value="">장소</option>
								<option value="서울본원">서울본원</option>
								<option value="대전본원">대전분원</option>
								<option value="부산본원">부산분원</option>
								<option value="대구본원">대구분원</option>
						</select></td>
					</tr>
					<tr>
						<td><label for="tuition">수강료</label></td>
						<td><input type="text" name="tuition">원</td>
					</tr>
					<tr>
						<td style="text-align: center;" colspan="2">
							<button class="btn" type="submit">수강신청</button>
							<button class="btn" type="button" onclick="fn_reset();">
								리셋하기</button>
					</tr>
				</table>
			</form>




		</div>
	</section>


	<%@ include file="bottom.jsp"%>
</body>
</html>