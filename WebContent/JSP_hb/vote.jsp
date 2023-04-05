<!-- <투표하기> -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
<style>
h1{
text-align : center;
}
table{
margin : auto;
}
</style>
</head>
<body>

<%@ 
include file = "topmenu.jsp"
%>
<section>

<h1>투표하기</h1><br>

<table width="500" cellpadding="0" cellspacing="0" border="1">
      <form action="vote.do"(index.jsp로 가게하기) method="post">
         <input type="hidden" name="v_jumin" value="${vote.v_jumin}">
         <tr>
            <td> 주민번호 </td>
            <td> <input type="text" name="v_jumin" value="${vote.v_jumin}"> 예:8906153154726 </td>
            </tr>
            <tr>
            <td> 성명 </td>
            <td> <input type="text" name="v_name" value="${vote.v_name}"> </td>
            </tr>
            <tr>
            <td> 투표번호 </td>
            <td> <input type="number" name="v_no" value="${vote.v_no}" min="1" max="5"> </td>
            </tr>
            <tr>
            <td> 투표시간 </td>
            <td> <input type="text" name="v_time" value="${vote.v_time}"> </td>
            </tr>
            <tr>
            <td> 투표장소 </td>
            <td> <input type="text" name="v_area" value="${vote.v_area}"> </td>
            </tr>
            <tr>
            <td> 유권자확인</td>
            <td> <input type="radio" name="v_confirm" value="${vote.v_confirm}">확인
            <input type="radio" name="v_confirm" value="${vote.v_confirm}">미확인
            </td>
				</tr>
				<tr>
				<td colspan="2"> <center> <input type="submit" value="투표하기"> 
				<input type="reset" value="다시하기"></center>
				</td>
				</tr>
      </form>
   </table>
   </section>
   <%@
include file = "footer.jsp"
%>
</body>
</html>