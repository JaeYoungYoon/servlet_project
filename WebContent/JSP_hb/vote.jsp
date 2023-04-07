
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">


<script src="../js/add.js"></script>
</head>

<body>

	<%@ 
include file="topmenu.jsp"%>
	<section>

		<h1>투표하기</h1>
		<br>

		<form action="submit.do" method="post">
			<table width="500" cellpadding="0" cellspacing="0" border="1">
				<tr>
					<td>주민번호</td>
					<td><input id="v_jumin" type="text" name="v_jumin"
						value="${vote.v_jumin}"> 예:8906153154726</td>
				</tr>
				<tr>
					<td>성명</td>
					<td><input id="v_name" type="text" name="v_name"
						value="${vote.v_name}" placeholder="홍길동"></td>
				</tr>
				<tr>
					<td>투표번호</td>
					<td><input id="m_no" type="number" name="m_no"
						value="${vote.m_no}" min="1" max="5"></td>
				</tr>
				<tr>
					<td>투표시간</td>
					<td><input id="v_time" type="text" name="v_time"
						value="${vote.v_time}" placeholder="09:30/13:30"></td>
				</tr>
				<tr>
					<td>투표장소</td>
					<td><input id="v_area" type="text" name="v_area"
						value="${vote.v_area}" placeholder="제1투표장/제2투표장"></td>
				</tr>
				<tr>
					<td>유권자확인</td>
					<td><input id="v_confirm" type="radio" name="v_confirm"
						value="Y">확인 <input id="v_confirm" type="radio"
						name="v_confirm" value="N">미확인</td>
				</tr>
				<tr>
					<td colspan="2">
						<center>
							<input type="submit" value="투표하기" onclick="return add()">
							<input type="reset" value="다시하기">
						</center>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>