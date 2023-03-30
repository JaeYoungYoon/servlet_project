<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>강사 조회</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
    />
    
    <link rel="stylesheet" href="./css/style_ys.css" />
	
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

    <script src="./js/clock.js"></script>
    
  	</head>
    
 <body>
 
 <%@ include file="top.jsp" %>
   
    <session>
    <DIV CLASS="TEAMWORK">
    
    	<h2>강사조회</h2>
  	
  	
  	<table style="border: 2px solid black; border-collapse: collapse; background-color: white; color: black;">
  	<tr style="border: 2px solid black;">
    	<th style="border: 2px solid black;">강사코드</th>
    	<th style="border: 2px solid black;">강사명</th>
    	<th style="border: 2px solid black;">강의명</th>
    	<th style="border: 2px solid black;">수강료</th>
    	<th style="border: 2px solid black;">장사자격취득일</th>
  	</tr>
  	<tr style="border: 2px solid black;">
    	<td style="border: 2px solid black;">100</td>
    	<td style="border: 2px solid black;">이초급</td>
    	<td style="border: 2px solid black;">초급반</td>
    	<td style="border: 2px solid black;">100,000</td>
    	<td style="border: 2px solid black;">2022년01월01일</td>
  	</tr>
  	<tr style="border: 2px solid black;">
    	<td style="border: 2px solid black;">200</td>
    	<td style="border: 2px solid black;">김중급</td>
    	<td style="border: 2px solid black;">중급반</td>
    	<td style="border: 2px solid black;">200,000</td>
    	<td style="border: 2px solid black;">2022년01월02일</td>
  	</tr>
  	<tr style="border: 2px solid black;">
    	<td style="border: 2px solid black;">300</td>
    	<td style="border: 2px solid black;">박고급</td>
    	<td style="border: 2px solid black;">고급반</td>
    	<td style="border: 2px solid black;">300,000</td>
    	<td style="border: 2px solid black;">2022년01월03일</td>
  	</tr>
  	<tr style="border: 2px solid black;">
    	<td style="border: 2px solid black;">400</td>
    	<td style="border: 2px solid black;">정심화</td>
    	<td style="border: 2px solid black;">심화반</td>
    	<td style="border: 2px solid black;">400,000</td>
    	<td style="border: 2px solid black;">2022년01월04일</td>
  	</tr>
</table>
    

</DIV>

    
</session>
    
   
    
    
 <%@ include file="bottom.jsp" %>   
    


  </body>
</html>