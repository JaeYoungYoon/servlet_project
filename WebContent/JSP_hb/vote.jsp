<!-- 투표하기 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
<style>
h1 {
	text-align: center;
}
</style>
</head>

<body>
	<%@ 
include file="topmenu.jsp"%>
	<section>

		<h1>투표하기</h1>
		<br>

		<form action="" method="post">
			주민번호 : <input type="text" name="regino" size=10>예 :
			8906153154726<br> 성명 : <input type="text" name="cname" size=10><br>
			투표번호 : <input type="number" name="voteno" min="1" max="5"><br>
			투표시간 : <input type="text" name="votetime" size=10><br>
			투표장소 : <input type="text" name="voteplace" size=10><br>
			유권자확인 : <input type="radio" name="votercheck" value="check">확인
			<input type="radio" name="votercheck" value="noncheck">미확인<br>
			<input type="submit" value="투표하기"> <input type="reset"
				value="다시하기">
		</form>
	</section>
	<%@
include file="footer.jsp"%>
</body>
</html>