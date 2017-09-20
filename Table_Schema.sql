
CREATE TABLE tbl_study (
	s_seq 		int auto_increment comment '시퀀스키', 
	s_name		varchar(50) not null comment '이름', 
	s_age		smallint not null comment '나이',
	s_hp		varchar(11) not null comment '핸드폰번호', 
	s_addr		varchar(100) not null comment '집주소',
	s_school 	varchar(100) not null comment '학교'
	s_grade		enum() not null comment '학년'
	s 			comment '시퀀스키'
	
	
) COMMENT '학생정보 테이블'

CREATE TABLE tbl_ (
) COMMENT '학교 정보'

CREATE TABLE tbl_ (
) COMMENT ''