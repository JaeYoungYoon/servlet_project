<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1 {
		text-align: center;
	}
	table {
		margin: 0 auto;
	}
	</style>
	<link rel="stylesheet" href="../css/style_ys.css" />
</head>

<body>
<%@ include file="top.jsp"%>

	<H1>강사매출현황</H1><br/><br/><br/>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>수강일자</td>
			<td>전화번호</td>
			<td>수강지역</td>
			<td>요금</td>
			<td>강사번호</td>
		</tr>
		<c:forEach var="classVO" items="${classes}">
			<tr>
				<td>${classVO.regist_month}</td>
				<td>${classVO.c_no}</td>
				<td>${classVO.class_area}</td>
				<td>${classVO.tuition}</td>
				<td>${classVO.teacher_code}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="list.do">목록으로</a></td>
		</tr>
	</table>

<%@ include file="bottom.jsp"%>
</body>
</html>