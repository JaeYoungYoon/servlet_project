<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css" />
</head>

<body>
	<%@ include file="topmenu.jsp"%>

	<section>
		<h1>강사매출현황</h1>
		<table>
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
		</table>

	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>