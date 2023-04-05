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

	
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<h1> 회원 정보 </h1><br/><br/><br/><br/>
		<tr>
			<td>회원번호</td>
			<td>회원이름</td>
			<td>전화번호</td>
			<td>주소</td>
			<td>회원등급</td>
		</tr>
		<c:forEach var="guest" items="${guests}">
			<tr>
				<td>${guest.c_no}</td>
				<td>${guest.c_name}</td>
				<td>${guest.phone}</td>
				<td>${guest.address}</td>
				<td>${guest.grade}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="list.do">목록으로</a></td>
		</tr>
	</table>
	

<%@ include file="bottom.jsp"%>
</body>
</html>