DROP TABLE IF EXISTS tb_sample;
CREATE TABLE "tb_sample"
(
    "seq"      bigint(64) auto_increment PRIMARY KEY, -- 시퀀스
    "id"       character varying(10) not null, -- 아이디
    "password" character varying(50) not null, -- 비밀번호
    "username" character varying(30), -- 이름
    "company"  character varying(100), -- 회사명
    "regdate"  timestamp(6) default CURRENT_TIMESTAMP not null, -- 최초 등록일
    "moddate"  timestamp(6) default CURRENT_TIMESTAMP, -- 수정일
    unique key uk_sample_id ("id")
);