<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="../css/style_ys.css" />
</head>
<body>

	<%@ include file="top.jsp"%>
	<div class="TEAMWORK">
		<h1>회원 정보</h1>

		<table width="500" cellpadding="0" cellspacing="0" border="1">

			<tr>
				<td>회원번호</td>
				<td>회원이름</td>
				<td>전화번호</td>
				<td>주소</td>
				<td>회원등급</td>
			</tr>
			<c:forEach var="guestmembers" items="${guests}">
				<tr>
					<td>${guestmembers.c_no}</td>
					<td>${guestmembers.c_name}</td>
					<td>${guestmembers.phone}</td>
					<td>${guestmembers.address}</td>
					<td>${guestmembers.grade}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><a href="list.do">목록으로</a></td>
			</tr>
		</table>

	</div>
	<%@ include file="bottom.jsp"%>
</body>
</html>