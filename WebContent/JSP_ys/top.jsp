<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />


<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	
<script src="./js/clock.js"></script>	
</head>
<body>
	<header>
		<div class="AREA">
			<h1>골프 연습장 회원관리 프로그램 VER1.0</h1>
		</div>
	</header>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="  ">장사조회</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarScroll" aria-controls="navbarScroll"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<div class="collapse navbar-collapse" id="navbarScroll">


			<ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll"
				style="max-height: 100px">


				<li class="nav-item"><a class="nav-link" href="#">수강신청</a></li>


				<li class="nav-item"><a class="nav-link" href="#">회원 정보 시스템</a>
				</li>


				<li class="nav-item"><a class="nav-link" href="#">장사 매출 현황</a>
				</li>

				<li class="nav-item"><a class="nav-link" href="./MainGolf.jsp">홈으로</a>
				</li>

			</ul>


			<h1 id="clock">00:00:00</h1>
			<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
			<!-- 시계 -->


		</div>
	</nav>
</body>
</html>