<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>골프 연습장 회원관리 프로그램 VER1.0</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" href="../css/style_ys.css" />
</head>

<body>

	<%@ include file="top.jsp"%>


	<section>

		<div class="TEAMWORK">
		<h1>골프 연습장 회원관리 시스템		</h1>
		<%-- <table>
		<tr>
				<td>번호</td>
				<td>${content_view.bid}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${content_view.bhit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bname"
					value="${content_view.bname}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="btitle"
					value="${content_view.btitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" name="bcontent">${content_view.bcontent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">
					&nbsp;&nbsp; <a href="list.do">목록보기</a> &nbsp;&nbsp; <a
					href="delete.do?bid=${content_view.bid}">삭제</a> &nbsp;&nbsp; <a
					href="reply_view.do?bid=${content_view.bid}">답변</a></td>
			</tr>	
		</table> --%>
		</div>

	
	</section>


	<%@ include file="bottom.jsp"%>
</body>
</html>