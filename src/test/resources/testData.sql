DROP TABLE table1 IF EXISTS;
CREATE TABLE table1 (
  ID VARCHAR (3),
  NAME VARCHAR(6)
);
INSERT INTO table1 VALUES ('1','Name1');
INSERT INTO table1 VALUES ('2','Name2');
INSERT INTO table1 VALUES ('3','Name3');
INSERT INTO table1 VALUES ('4','Name3');

DROP TABLE table2 IF EXISTS;
CREATE TABLE table2 (
  ID VARCHAR (3),
  NAME VARCHAR(6)
);
INSERT INTO table2 VALUES ('2','Name2');
INSERT INTO table2 VALUES ('2','Name3');
INSERT INTO table2 VALUES ('3','Name3');
INSERT INTO table2 VALUES ('3','Name4');