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
		<h1>홈쇼핑 회원 등록</h1>
		<form name="form" action="insert.do" method="get">
			<table>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone"
						placeholder="010-1111-2222"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<th>고객등급</th>
					<td><input type="text" name="grade"
						placeholder="[A:VIP,B:일반,C:직원]"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button class="btn" type="submit">등록하기</button>
						<button class="btn" type="button" onclick="location='list.do'">조회하기</button>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>