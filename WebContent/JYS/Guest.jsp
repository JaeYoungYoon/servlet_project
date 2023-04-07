<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/style_ys.css" />
</head>
<body>

	<%@ include file="top.jsp"%>

	<div class="TEAMWORK">
	<h1>회원 정보</h1>

	<table>

		<tr>
			<td>수강월</td>
			<td>회원번호</td>
			<td>회원명</td>
			<td>강의명</td>
			<td>강의장소</td>
			<td>수강료</td>
			<td>등급</td>
		</tr>
		<c:forEach var="guest" items="${guests}">
			<tr>
				<td>${guest.regist_month}</td>
				<td>${guest.c_no}</td>
				<td>${guest.c_name}</td>
				<td>${guest.class_name}</td>
				<td>${guest.class_area}</td>
				<td>${guest.tuition}</td>
				<td>${guest.grade}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7"><a href="list.do">목록으로</a></td>
		</tr>
	</table>
	
	</div>

	<%@ include file="bottom.jsp"%>
</body>
</html>