<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>
		<h1>회원 정보 수정</h1>
		<form name="form" action="modify.do?custno = ${board.custno}" method="get">
			<input type="hidden" value="${board.custno}">
			<table>
				<tr>
					<th>회원번호</th>
					<td>${board.custno}</td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"
						value="${board.custname}"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone" value="${board.phone}"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address" value="${board.address}"></td>
				</tr>
				<tr>
					<th>고객등급[A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade" value="${board.grade}"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city" value="${board.city}"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button class="btn" type="submit">수정하기</button>
						<button class="btn" type="button" onclick="location='list.do'">조회하기</button>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>