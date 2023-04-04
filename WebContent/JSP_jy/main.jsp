<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>
		<div class="title">쇼핑몰 회원관리 프로그램</div>
		<div class="main">
			쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.<br> 프로그램
			작성 순서
			<ul>
				<li>회원정보 테이블을 생성한다.
					<ul>
						<li>create table member_tbl_02 (<br> custno number(6)
							not null primary key,<br> custname varchar2(20),<br>
							phone varchar2(13),<br> address varchar2(60),<br>
							joindate date,<br> grade char(1),<br> city char(2)<br>
							);
						</li>
						<li>create table money_tbl_02 (<br> custno number(6),<br>
							salenol number(8),<br> pcost number(8),<br> amount
							number(4),<br> price number(8),<br> pcode varchar2(4),<br>
							sdate date,<br> CONSTRAINT money_pk PRIMARY KEY
							(custno,salenol)<br> );
						</li>
					</ul>
				</li>

				<li>회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.
					<ul>
						<li>create sequence membernum_seq INCREMENT BY 1 START WITH
							100001;</li>
						<li>select * from member_tbl_02;<br> select * from
							money_tbl_02;
						</li>
						<li>insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'김행복', '010-1111-2222', '서울 동대문구 휘경1동', '2015-12-02', 'A', '01');<br>
							insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'이축복', '010-1111-3333', '서울 동대문구 휘경2동', '2015-12-06', 'B', '01');<br>
							insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', '2015-10-01', 'B', '30');<br>
							insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'최사랑', '010-1111-5555', '울릉군 울릉읍 독도2리', '2015-11-13', 'A', '30');<br>
							insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'진평화', '010-1111-6666', '제주도 제주시 외나무골', '2015-12-25', 'B', '60');<br>
							insert into member_tbl_02 values(membernum_seq.nextval,<br>
							'차공단', '010-1111-7777', '제주도 제주시 감나무골', '2015-12-11', 'C', '60');<br>
						</li>
						<li>insert into money_tbl_02 values(100001, 20160001, 500, 5,
							2500, 'A001', '2016-01-01');<br> insert into money_tbl_02
							values(100001, 20160002, 1000, 4, 4000, 'A002', '2016-01-01');<br>
							insert into money_tbl_02 values(100001, 20160003, 500, 3, 2500,
							'A008', '2016-01-01');<br> insert into money_tbl_02
							values(100002, 20160004, 2000, 1, 2000, 'A004', '2016-01-02');<br>
							insert into money_tbl_02 values(100002, 20160005, 500, 1, 500,
							'A001', '2016-01-03');<br> insert into money_tbl_02
							values(100003, 20160006, 1500, 2, 3000, 'A003', '2016-01-03');<br>
							insert into money_tbl_02 values(100004, 20160007, 500, 2, 1000,
							'A001', '2016-01-04');<br> insert into money_tbl_02
							values(100004, 20160008, 300, 1, 300, 'A005', '2016-01-04');<br>
							insert into money_tbl_02 values(100004, 20160009, 600, 1, 600,
							'A006', '2016-01-04');<br> insert into money_tbl_02
							values(100004, 20160010, 3000, 1, 3000, 'A007', '2016-01-06');
						</li>
					</ul>
				</li>

				<li>회원정보 입력하면 프로그램을 작성한다.</li>
				<li>회원정보 조회 프로그램을 작성한다.</li>
				<li>회원매출정보 조회 프로그램을 작성한다.</li>
			</ul>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>