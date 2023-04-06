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
			<h1>강사 조회</h1><br/><br/><br/>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>강사번호</td>
			<td>강사이름</td>
			<td>강의이름</td>
			<td>강의료</td>
			<td>강사취득일자</td>
		</tr>
		<c:forEach var="teacher" items="${teachers}">
			<tr>
				<td>${teacher.teacher_code}</td>
				<td>${teacher.teacher_name}</td>
				<td>${teacher.class_name}</td>
				<td>${teacher.class_price}</td>
				<td>${teacher.teacher_regist_date4}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="list.do">목록으로</a></td>
		</tr>
		
		<%@ include file="bottom.jsp"%>
	</table>
<%@ include file="bottom.jsp"%>

</body>
</html>