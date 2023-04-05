<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" href="./css/style_ys.css" />

<style>
table {
	border-collapse: collapse;
	border: 3px solid black;
	background-color: white;
	color: black;
	margin: auto;
}
th, td {
	border: 1px solid black;
	padding: 10px;
	text-align: center;
}

tr {
	border-collapse: collapse;
	background-color: white;
	color: black;
	border: 2px solid black;
}

td {
	border-collapse: collapse;
	background-color: white;
	color: black;
	border: 2px solid black;
}
</style>

</head>

<body>

	<%@ include file="top.jsp"%>


	<section>
		<div class="TEAMWORK">


			<h2>강사매출현황</h2>


			<table>
				<!-- <tr>
					<th>강사코드</th>
					<th>강의명</th>
					<th>강사명</th>
					<th>총매출</th>
				</tr>
				<tr>
					<td>100</td>
					<td>초급반</td>
					<td>이초급</td>
					<td>200,000</td>
				</tr>
				<tr>
					<td>200</td>
					<td>중급반</td>
					<td>김중급</td>
					<td>200,000</td>
				</tr>
				<tr>
					<td>300</td>
					<td>고급반</td>
					<td>박고급</td>
					<td>150,000</td>
				</tr>
				<tr>
					<td>400</td>
					<td>심화반</td>
					<td>정심화</td>
					<td>200,000</td>
				</tr> -->
				<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
		<c:forEach var="board" items="${boards}">
			<tr>
				<td>${board.bid}</td>
				<td>${board.bname}</td>
				<td><c:forEach begin="1" end="${board.bindent}">-</c:forEach> <a
					href="content_view.do?bid=${board.bid}">${board.btitle}</a></td>
				<td>${board.bdate}</td>
				<td>${board.bhit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글작성</a></td>
		</tr>
				
				
			</table>


		</div>


	</section>


	<%@ include file="bottom.jsp"%>
</body>
</html>