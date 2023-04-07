<!-- <후보조회> -->
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

	<%@ 
include file="topmenu.jsp"%>
	<section>

		<h1>후보조회</h1>
		<br>

		<form action="VCcheck.do" method="post">
			<table>
				<input type="hidden" name="m_no" value="${VCcheck.m_no}">

				<tr>
					<td>후보번호</td>
					<td>성명</td>
					<td>소속정당</td>
					<td>학력</td>
					<td>주민번호</td>
					<td>지역구</td>
					<td>대표전화</td>
				</tr>
				<c:forEach var="VCcheck" items="${boards}">
					<tr>
						<td>${VCcheck.m_no}</td>
						<td>${VCcheck.m_name}</td>
						<td>${VCcheck.p_code}</td>
						<td>${VCcheck.p_school}</td>
						<td>${VCcheck.m_jumin}</td>
						<td>${VCcheck.m_city}</td>
						<td>${VCcheck.p_tel1}- ${VCcheck.p_tel2} - ${VCcheck.p_tel3}
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>