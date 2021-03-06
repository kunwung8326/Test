DROP TABLE  GALLERYMEMBER;
CREATE TABLE GALLERYMEMBER
(
    NO NUMBER PRIMARY KEY,
    ID VARCHAR2(50) NOT NULL UNIQUE,
    PW VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(50),
    PHONE VARCHAR2(50),
    EMAIL VARCHAR2(50) NOT NULL,
    ADDR VARCHAR2(100),
    REGDATE DATE,
    STATUS NUMBER
);

DROP SEQUENCE GALLERYMEMBER_SEQ;
CREATE SEQUENCE  GALLERYMEMBER_SEQ INCREMENT BY 1 START WITH 1 NOCYCLE NOCACHE;



CREATE TABLE GALLERYLIST 
{
	NO NUMBER PRIMARY KEY,
	TITLE VARCHAR2(30),
	CONTENT VARCHAR2(300),
	POSTDATE DATE ,
	LASTEDIT DATE,
	IP VARCHAR2(30),
	HIT NUMBER
	
	
}

CREATE SEQUENCE GALLERYLIST_SEQ INCREMENT BY 1 START WITH 1 NOCYCLE NOCACHE;

CREATE TABLE REPLY{
	NO  NUMBER PRIMARY KEY, 
	ID  VARCHAR2(30), 
	CONTENT VARCHAR2(300),
	POSTDATE DATE,
	IP VARCHAR2(30)
	
	
}

CREATE FREEREPLY{
	NO NUMBER ,
	ID  VARCHAR2(30), 
	CONTENT VARCHAR2(300),
	POSTDATE DATE,
	IP VARCHAR2(30),
	STATUS NUMBER,
	GROUPNO NUMBER,
	GROUPORD NUMBER,
	DEPTH NUMBER
	
}



