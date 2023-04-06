# servlet_project
참여자 : 윤재영 이희복 조유성

~ FrontEnd - View ~
프로젝트 폴더
- index.jsp (프로젝트 접속)

투표 (이희복)
- index.jsp / VCcheck.jsp (후보 조회) / Vote.jsp (투표하기) / VVcheck.jsp (투표 검수 조회) / VCrank.jsp (후보자 등수)
- topmenu, footer (include)

쇼핑몰 (윤재영)
- main.jsp / add.jsp (회원 등록하기) / list.jsp (회원목록 조회) / result.jsp (매출 조회)
- topmenu, footer (include)

골프장 (조유성)
- MainGolf.jsp / / / 
- top, bottom (include)

======================

~ BackEnd - Server ~
(데이터베이스를 다루는 VO, DAO 정리)

투표
- VoteController (Servlet)
- VCcheckVO, VoteVO, VVCheckVO, VCrankVO
- VCcheckDAO, VoteDAO, VVCheckDAO, VCrankDAO
- VCommand (Command Interface)
- VCcheckCommand, VoteCommand, VVCheckCommand, VCrankCommand

쇼핑몰
- ShoppingController (Servlet)
- MemberVO, MoneyVO, MemberPriceVO
- MemberDAO
- SCommand (Command Interface)
- SListCommand, SResultCommand, SInsertCommand

골프장
- (Servlet)
- (VO)
- (DAO)
- (Command Interface)
- (Command)

======================

~ Database ~
(각 프로젝트 별 데이터베이스)
- heebok1.sql (투표 데이터)
- jaeyoung.sql (쇼핑몰 데이터)
- GolfProject.sql (골프장 관리 테이블 데이터)
