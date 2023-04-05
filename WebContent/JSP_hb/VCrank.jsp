<!-- <후보자등수> -->
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
      <form action="c_rank.do" method="post">
         <input type="hidden" name="m_no" value="${VCrank.m_no}">
         <tr>
            <td> 후보번호 </td>
            <td> 성명 </td>
            <td> 총투표건수 </td>
            </tr>
            <tr>
            <td> ${VCrank.m_no} </td>
         <td> ${VCrank.m_name} </td>
         <td> ${VCrank.m_total} </td>
         </tr>
      </form>
   </table>
   </section>
   <%@
include file = "footer.jsp"
%>
</body>
</html>