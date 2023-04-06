<!-- <후보자등수> -->
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

		<h1>후보자등수</h1>

		<table>

			<thead>
				<tr>
					<th>후보번호</th>
					<th>성명</th>
					<th>총투표건수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="VCrank" items="${boards}">
					<tr>
						<td>${VCrank.m_no}</td>
						<td>${VCrank.m_name}</td>
						<td>${VCrank.m_total}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>