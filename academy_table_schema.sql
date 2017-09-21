
CREATE TABLE tbl_school (
	s_seq		int auto_increment comment '시퀀스키', 
    s_name	 	varchar(200) not null comment '학교명', 
    s_grade	    tinyint not null comment '초/중/고/대',
    primary		key(s_seq)
) comment '학교정보';

CREATE TABLE tbl_student (
	seq 	    int auto_increment comment '시퀀스키', 
	name	    varchar(50) not null comment '이름',
	age		   	smallint not null comment '나이',
	birth	    char(6) default '000000' comment '생년월일',	
	hp			varchar(11) not null comment '핸드폰번호', 
	addr		varchar(100) not null comment '집주소',
	school 		int not null comment '학교',
	grade		char(1) not null comment '학년', 
	regdate		date not null comment '등록일',
	del_date	date null comment '나간날짜',
	re_date		date null comment '다시들어온날짜',
	is_delete	enum('Y','N') comment '수강여부', 
	primary		key(seq),
) COMMENT '학생정보 테이블'

CREATE TABLE tbl_student (
	seq 	    	int auto_increment comment '시퀀스키', 
	name	    	varchar(50) not null comment '이름',
	age		   	 smallint not null comment '나이',
	birth	    	char(6) default '000000' comment '생년월일',	
	hp			 varchar(11) not null comment '핸드폰번호', 
	addr		 varchar(100) not null comment '집주소',
	school 		 int not null comment '학교',
	grade		 char(1) not null comment '학년', 
	regdate		 date not null comment '등록일',
	del_date	 date null comment '나간날짜',
	re_date		 date null comment '다시들어온날짜',
	is_delete	 enum('Y','N') comment '수강여부', 
	primary		 key(seq),
	foreign 	 key(school) references tbl_school(s_seq)
) COMMENT '학생정보 테이블'