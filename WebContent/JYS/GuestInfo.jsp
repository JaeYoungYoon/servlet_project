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


			<h2>회원정보조회</h2>


			<table>
				<tr>
					<th>수강월</th>
					<th>회원번호</th>
					<th>회원명</th>
					<th>강의명</th>
					<th>강의장소</th>
					<th>수강료</th>
					<th>등급</th>
				</tr>
				<tr>
					<td>2022년 03월</td>
					<td>10001</td>
					<td>홍길동</td>
					<td>초급반</td>
					<td>서울본원</td>
					<td>100,000</td>
					<td>일반</td>
				</tr>
				<tr>
					<td>2022년 03월</td>
					<td>10002</td>
					<td>장발장</td>
					<td>초급반</td>
					<td>성남분원</td>
					<td>100,000</td>
					<td>일반</td>
				</tr>
				<tr>
					<td>2022년 03월</td>
					<td>10003</td>
					<td>임꺽정</td>
					<td>중급반</td>
					<td>대전분원</td>
					<td>200,000</td>
					<td>일반</td>
				</tr>
				<tr>
					<td>2022년 03월</td>
					<td>20001</td>
					<td>성춘향</td>
					<td>고급반</td>
					<td>부산분원</td>
					<td>150,000</td>
					<td>VIP</td>
				</tr>
				<tr>
					<td>2022년 03월</td>
					<td>20002</td>
					<td>이몽룡</td>
					<td>심화반</td>
					<td>대구분원</td>
					<td>200,000</td>
					<td>VIP</td>
				</tr>
			</table>
		</div>


		</div>


	</section>


	<%@ include file="bottom.jsp"%>
</body>
</html>