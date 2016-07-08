CREATE USER isava IDENTIFIED BY isava; -- you should replace my user name with yours. â€œIDENTIFIED BYâ€? means the password.
GRANT CREATE SESSION TO isava; -- necessary for connecting to the database with your new user.
GRANT CREATE ANY INDEX TO isava; -- we use indexes for faster queries.
GRANT ALTER ANY INDEX TO isava;
GRANT DROP ANY INDEX TO isava;
GRANT CREATE ANY PROCEDURE TO isava; -- we will use them in following workshops.
GRANT ALTER ANY PROCEDURE TO isava;
GRANT DROP ANY PROCEDURE TO isava;
GRANT EXECUTE ANY PROCEDURE TO isava;
GRANT CREATE ANY SEQUENCE TO isava; -- we need sequences for inserting data.
GRANT ALTER ANY SEQUENCE TO isava;
GRANT DROP ANY SEQUENCE TO isava;
GRANT SELECT ANY SEQUENCE TO isava;
GRANT CREATE ANY TABLE TO isava;
GRANT ALTER ANY TABLE TO isava;
GRANT DELETE ANY TABLE TO isava;
GRANT DROP ANY TABLE TO isava;
GRANT INSERT ANY TABLE TO isava;
GRANT LOCK ANY TABLE TO isava;
GRANT SELECT ANY TABLE TO isava;
GRANT UPDATE ANY TABLE TO isava;
GRANT CREATE TABLESPACE TO isava;
GRANT ALTER TABLESPACE TO isava;
GRANT DROP TABLESPACE TO isava;
GRANT CREATE ANY VIEW TO isava;
GRANT DROP ANY VIEW TO isava;
GRANT UNDER ANY VIEW TO isava;
alter user isava quota 50m on system;
