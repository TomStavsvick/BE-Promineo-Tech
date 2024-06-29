# Week 8 Research
Introduction to MySQL

References:
* https://www.w3schools.com/mysql/mysql_primarykey.asp

* https://www.w3schools.com/sql/sql_foreignkey.asp

* https://www.w3schools.in/mysql/ddl-dml-dcl


## Prompts:
2. Research primary & foreign keys in RDBMSs?  What are they?  Why are they useful?
    1. Primary Keys are unique identifiers for each record in a given table.  There can only be one primary key in a table.  The primary key can include multiple columns though.

    2. Foreign Keys are fields in a table that point to primary keys in other tables.  You can use them to link data between tables as being related.  They are not unique, so a table may have multiple records that share a foreign key.

3. Define DDL and DML.  What do these acronyms mean?  Describe each one.  Give examples.
    1. DDL - Data Definition Language - These create or configure the structure or architecture of the database.  These are used to create databases, tables, change the structure of tables, and delete databases.  These commands/statements are permanent so they cannot be undone.
    2. DML - Data Manipulation Language - These deal with the data inside the database or table.  You can insert new records, update records, or read records (using Select).  These do not adjust the structure of the tables/databases but allow access to the data inside.  The changes could potentially be rolled back.


