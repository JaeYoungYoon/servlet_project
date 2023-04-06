<!-- <투표검수조회> -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">

</head>
<body>

	<%@ include file="topmenu.jsp"%>
	<section>

		<h1>투표검수조회</h1>
		
		<table>
			<thead>
				<tr>
					<th>성명</th>
					<th>생년월일</th>
					<th>나이</th>
					<th>성별</th>
					<th>후보번호</th>
					<th>투표시간</th>
					<th>유권자확인</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="VVcheck" items="${boards}">
					<tr>
						<td>${VVcheck.v_name}</td>
						<td>${VVcheck.v_birth}</td>
						<td>${VVcheck.v_age}</td>
						<td>${VVcheck.v_gender}</td>
						<td>${VVcheck.m_no}</td>
						<td>${VVcheck.v_time}</td>
						<td>${VVcheck.v_confirm}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>