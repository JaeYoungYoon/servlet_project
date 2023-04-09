CREATE TABLE TBL_MEMBER_202005(M_NO CHAR(1) CONSTRAINT TBL_MEMBER_202005_M_NO_PK PRIMARY KEY,
M_NAME VARCHAR2(20), P_CODE CHAR(2) CONSTRAINT TBL_MEMBER_202005_P_CODE_FK REFERENCES TBL_PARTY_202005(P_CODE), 
P_SCHOOL CHAR(1), M_JUMIN CHAR(13), M_CITY CHAR(20) 
);

INSERT INTO TBL_MEMBER_202005 VALUES('1', '김후보', 'P1', '1', '6603011999991' , '수선화동');
INSERT INTO TBL_MEMBER_202005 VALUES('2', '이후보', 'P2', '3', '5503011999992' , '민들레동');
INSERT INTO TBL_MEMBER_202005 VALUES('3', '박후보', 'P3', '2', '7703011999993' , '나팔꽃동');
INSERT INTO TBL_MEMBER_202005 VALUES('4', '조후보', 'P4', '2', '8803011999994' , '진달래동');
INSERT INTO TBL_MEMBER_202005 VALUES('5', '최후보', 'P5', '3', '9903011999995' , '개나리동');

CREATE TABLE TBL_PARTY_202005(P_CODE CHAR(2) CONSTRAINT TBL_PARTY_202005_P_CODE_PK PRIMARY KEY,
P_NAME VARCHAR2(20), P_INDATE DATE, P_READER VARCHAR2(20),
P_TEL1 CHAR(3), P_TEL2 CHAR(4), P_TEL3 CHAR(4) 
);

INSERT INTO TBL_PARTY_202005 VALUES('P1', 'A정당', '2010-01-01', '위대표', '02', '1111', '0001');
INSERT INTO TBL_PARTY_202005 VALUES('P2', 'B정당', '2010-02-01', '명대표', '02', '1111', '0002');
INSERT INTO TBL_PARTY_202005 VALUES('P3', 'C정당', '2010-03-01', '기대표', '02', '1111', '0003');
INSERT INTO TBL_PARTY_202005 VALUES('P4', 'D정당', '2010-04-01', '옥대표', '02', '1111', '0004');
INSERT INTO TBL_PARTY_202005 VALUES('P5', 'E정당', '2010-05-01', '임대표', '02', '1111', '0005');

CREATE TABLE TBL_VOTE_202005(V_JUMIN CHAR(13) CONSTRAINT TBL_VOTE_202005_V_JUMIN_PK PRIMARY KEY,
V_NAME VARCHAR2(20), M_NO CHAR(1) CONSTRAINT TBL_VOTE_202005_M_NO_FK REFERENCES TBL_MEMBER_202005(M_NO), V_TIME CHAR(4),
V_AREA CHAR(20), V_CONFIRM CHAR(1) 
);

INSERT INTO TBL_VOTE_202005 VALUES('99010110001', '김유권', '1', '0930','제1투표장', 'N');
INSERT INTO TBL_VOTE_202005 VALUES('89010120002', '이유권', '2', '0930','제1투표장', 'N');
INSERT INTO TBL_VOTE_202005 VALUES('69010110003', '박유권', '3', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('59010120004', '홍유권', '4', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010110005', '조유권', '5', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('89010120006', '최유권', '1', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('59010110007', '지유권', '1', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('49010120008', '장유권', '3', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010110009', '정유권', '3', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('89010120010', '강유권', '4', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('99010110011', '신유권', '5', '0930','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010120012', '오유권', '1', '1330','제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('69010110013', '현유권', '4', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('89010110014', '왕유권', '2', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('99010110015', '유유권', '3', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010110016', '한유권', '2', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('89010110017', '문유권', '4', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('99010110018', '양유권', '2', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('99010110019', '구유권', '4', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010110020', '황유권', '5', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('69010110021', '배유권', '3', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('79010110022', '전유권', '3', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('99010110023', '고유권', '1', '1330','제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES('59010110024', '권유권', '3', '1330','제2투표장', 'Y');

