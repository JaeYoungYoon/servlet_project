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

	<h1>강사매출현황</h1>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>강사코드</td>
			<td>강의이름</td>
			<td>강사이름</td>
			<td>요금</td>

		</tr>
		<c:forEach var="classVO" items="${boards}">
			<tr>
				<td>${classVO.teacher_code}</td>
				<td>${classVO.class_name}</td>
				<td>${classVO.teacher_name}</td>
				<td>${classVO.tuition}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="list.do">목록으로</a></td>
		</tr>
	</table>

<%@ include file="bottom.jsp"%>
</body>
</html>