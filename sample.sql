DROP TABLE IF EXISTS tb_sample;
CREATE TABLE "tb_sample"
(
    "seq"      bigint(64) auto_increment PRIMARY KEY,
    "id"       character varying(10) not null,
    "password" character varying(50) not null,
    "username" character varying(30),
    "company"  character varying(100),
    "regdate"  timestamp(6) default CURRENT_TIMESTAMP not null,
    "moddate"  timestamp(6) default CURRENT_TIMESTAMP,
    unique key uk_sample_id ("id")
);