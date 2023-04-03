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
		<div class="title">쇼핑몰 회원관리 프로그램</div>
		<div class="wrapper">
			<table>
				<tr>
					<td>회원번호</td>
					<td>회원성명</td>
					<td>회원전화</td>
					<td>회원주소</td>
					<td>가입일자</td>
					<td>고객등급</td>
					<td>도시코드</td>
				</tr>
				<c:forEach var="board" items="${boards}">
					<tr>
						<td>${board.custno}</td>
						<td>${board.custname}</td>
						<td>${board.phone}</td>
						<td>${board.address}</td>
						<td>${board.joindate}</td>
						<td>${board.grade}</td>
						<td>${board.city}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="7"><a href="write_view.do">글작성</a></td>
				</tr>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>