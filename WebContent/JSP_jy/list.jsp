<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h1>쇼핑몰 회원관리 프로그램</h1>

		<table>
			<thead>
				<tr>
					<th>회원번호</th>
					<th>회원성명</th>
					<th>회원전화</th>
					<th>회원주소</th>
					<th>가입일자</th>
					<th>고객등급</th>
					<th>도시코드</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boards}">
					<tr>
						<td><a href="view.do?custno=${board.custno}">${board.custno}</a></td>
						<td>${board.custname}</td>
						<td>${board.phone}</td>
						<td>${board.address}</td>
						<td>${board.joindate}</td>
						<td>${board.grade}</td>
						<td>${board.city}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>