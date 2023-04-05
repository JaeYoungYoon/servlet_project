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
		<div class="title">회원매출조회</div>
		<div class="wrapper">
			<table>
				<thead>
					<tr>
						<th>회원번호</th>
						<th>회원성명</th>
						<th>등급</th>
						<th>가격</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="board" items="${boards}">
						<tr>
							<td>${board.custno}</td>
							<td>${board.custname}</td>
							<td>${board.grade}</td>
							<td>${board.price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>