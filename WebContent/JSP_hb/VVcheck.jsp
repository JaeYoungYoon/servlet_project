<!-- <투표검수조회> -->
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
text-align : center;
}

</style>
</head>
<body>

<%@ 
include file = "topmenu.jsp"
%>
<section>

<h1>투표검수조회</h1><br>

<table width="500" cellpadding="0" cellspacing="0" border="1">
      <form action="VVcheck.do" method="post">
         <input type="hidden" name="v_name" value="${VVcheck.v_name}">
         <tr>
            <td> 성명 </td>
            <td> 생년월일 </td>
            <td> 나이 </td>
            <td> 성별 </td>
            <td> 후보번호 </td>
            <td> 투표시간 </td>
            <td> 유권자확인 </td>
            </tr>
            <tr>
            <td> ${VVcheck.v_name} </td>
         <td> ${VVcheck.v_date} </td>
         <td> ${VVcheck.v_age} </td>
         <td> ${VVcheck.v_gender} </td>
         <td> ${VVcheck.m_no} </td>
         <td> ${VVcheck.v_time} </td>
         <td> ${VVcheck.v_confirm}</td>
         </tr>
      </form>
   </table>
   </section>
   <%@
include file = "footer.jsp"
%>
</body>
</html>