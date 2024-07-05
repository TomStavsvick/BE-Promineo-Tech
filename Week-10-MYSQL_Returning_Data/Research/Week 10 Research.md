# Week 10 Research
My SQL - Returning Data

References:
* https://www.geeksforgeeks.org/introduction-to-jdbc/

* https://www.geeksforgeeks.org/execute-a-sql-query-using-jdbc/


## Prompts:
1. What is JDBC?  What does it stand for?  How does it differ from or relate to MySQL?
    1. JDBC Stands for Java DataBase Connectivity. It is a mechanism to interact with databases for a Java application. It is used like a library, providing methods and interfaes to interact with a database.
    2. MySQL is an RDBMS.  JDBC and MySQL differ in that they are different parts of the system.  JDBC connects the java code to the database, while MySQL defines the database system.

3. What are the two method calls to execute a query in JDBC, and when do you use each?
    1. Statement.executeQuery() - can be used for simple queries that do not take on parameters.  It is not safe from injection attacks (where the user could input valid MySQL statements in the user input), but would still be ok for simple non-user input activities.
    2. PreparedStatement.executeQuery() - is better for queries that do take in input from the users.  They are safe from injection attacks


