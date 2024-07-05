# Week 9 Research
MYSQL JDBC

References:

* https://www.w3schools.com/mysql/mysql_wildcards.asp

* https://www.guru99.com/wildcards.html

* https://www.geeksforgeeks.org/introduction-to-jdbc/

## Prompts:
3. What are wildcards in MySQL? How are they useful? Give an example of a MySQL statement that could use wildcards.

    1. Wildcards are used to allow any one or multiple characters in a string to be ignored during a query. You can use it with the WHERE clause and the LIKE operator. There are 2 wildcard characters, the '_' is used to slect any character in that space. The % will select multiple (or no) characters in that space.
    (a) A useful example for the '_' wildcard would be searching your music database for 90s rock songs. You could query something like:

    * SELECT * WHERE releaseYear LIKE "199_";
    * The above query would reaturn all colums where the releaseYear is 1990 - 1999

    (b) A useful exmple for the '%' wildcard would be searching your documentation database for information on SQL. You could query something like:

    * SELCT * WHERE title LIKE "%SQL%";
    * The above query would return all the documents who's title incluses the sequence SQL, and would include the beginning and end of the title string.
    
4. Define JDBC. What is JDBC? Describe it in your own words. How is it used?

    1. JDBC Stands for Java DataBase Connectivity. It is a mechanism to interact with databases for a Java application. It is used like a library, providing methods and interfaes to interact with a database.
