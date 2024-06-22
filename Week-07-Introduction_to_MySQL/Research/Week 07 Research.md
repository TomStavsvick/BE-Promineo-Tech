# Week 7 Research
Introduction to MySQL

References:
* https://www.javatpoint.com/database-vs-schema

* https://www.coursera.org/articles/difference-between-dbms-and-rdbms

* https://www.geeksforgeeks.org/difference-between-rdbms-and-dbms/


## Prompts:
1. What is a database?  What is a schema?  Compare and contrast?

    (a) Database - A stored volume of interrelated data.  The database contains schema, in addition to the data itself.  A database can also contain multiple schema.

    (b) Schema - A definition of the tables and information to be stored in the database.  Kind of like a blueprint of what will be in the database.  Does NOT contain any data/records.

    (c) Compare/Contrast - In reading about Databases and Schmas, it almost made me think of the relationship between classes and interfaces in Java.  The database is like an instance of a class, with all the data inside it, but it contains the schemas, which like interfaces define what is needed within the class.  The information stored in the database is design to be able to be modified, while changing a schema will change how all the data in the database would be stored/organized and would be expensive like changing the blueprint of a building after it is built.


2. What is a DBMS?  What is an RDBMS?  Compare and contrast. 

    (a) DBMS - DataBase Management System.  Software that stores data and controls access to it.  The DBMS is the conduit for users to access the data in the database.  Generally stored in a file format and accessed by a single user.

    (b) RDBMS - Relational DataBase Management System.  A special form of DBMS where data is stored in table format, and where tables have related information with each other.  It can also support larger data sets and multiple users.

    (c) Compare/Contrast - RDBMS can store more information that DMBS, can be quicker to retrieve and update information, provides better security, and supports multiple users.  DBMS software generally requires less hardware performance.

