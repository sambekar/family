CREATE USER IF NOT EXISTS FAMILY PASSWORD 'FAMILY';
CREATE SCHEMA IF NOT EXISTS FAMILY;
SET SCHEMA FAMILY;

CREATE SEQUENCE FAMILY.SQ_PERSON;
CREATE TABLE FAMILY.PERSON(
    ID NUMBER,
    FIRSTNAME VARCHAR(100),
    MIDDLENAME VARCHAR(100),
    LASTNAME VARCHAR(100),
    GENDER VARCHAR(100),
    DATEOFBIRTH TIMESTAMP(6),
    OTHERDETAILS VARCHAR(100)
);

CREATE SEQUENCE FAMILY.SQ_RELATION;
CREATE TABLE FAMILY.RELATION(
    ID NUMBER,
    RELATION VARCHAR(100)
);

INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'HUSBAND');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'WIFE');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'BROTHER');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'SISTER');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'MOTHER');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'FATHER');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'SON');
INSERT INTO FAMILY.RELATION VALUES (SQ_RELATION.NEXTVAL , 'DAUGHTER');
COMMIT;

CREATE SEQUENCE FAMILY.SQ_RELATIONSHIP;
CREATE TABLE FAMILY.RELATIONSHIP(
    ID NUMBER,
    PERSON_1_ID NUMBER,
    PERSON_2_ID NUMBER,
    RELATION_1_ID NUMBER,
    RELATION_2_ID NUMBER
)