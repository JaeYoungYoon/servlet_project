# servlet_project
참여자 : 윤재영 이희복 조유성

~ front ~
프로젝트 폴더
- index.jsp (프로젝트 접속)

투표 (이희복)
- index.jsp / vote.jsp
- topmenu, footer (include)

쇼핑몰 (윤재영)
- main.jsp / add.jsp / result.jsp / list.jsp
- topmenu, footer (include)

골프장 (조유성)
- MainGolf.jsp
- top, bottom (include)

======================

~ back ~
(데이터베이스를 다루는 VO, DAO 정리)

투표
- CandidateCheck (VO, DAO)
- CandidateRank (VO, DAO)
- VoteCheck (VO, DAO)

쇼핑몰
- ShoppingController (Servlet)
- MemberVO, MoneyVO
- MemberDAO
- SCommand (Command Interface)
- SListCommand, SResultCommand

골프장

======================

~ Database ~
(각 프로젝트 별 데이터베이스)
- heebok1.sql (투표 데이터)
- jaeyoung.sql (쇼핑몰 데이터)
- GolfProject.sql (골프장 관리 테이블 데이터)
