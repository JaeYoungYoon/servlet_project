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
						<th>판매번호</th>
						<th>단가</th>
						<th>수량</th>
						<th>가격</th>
						<th>상품코드</th>
						<th>판매일자</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="board" items="${boards}">
						<tr>
							<td>${board.custno}</td>
							<td>${board.salenol}</td>
							<td>${board.pcost}</td>
							<td>${board.amount}</td>
							<td>${board.price}</td>
							<td>${board.pcode}</td>
							<td>${board.sdate}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>