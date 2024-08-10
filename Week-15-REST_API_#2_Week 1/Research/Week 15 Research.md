# Week 15 Research
Intro to Spring Boot - REST API #12 Week 1

References:
* https://www.geeksforgeeks.org/spring-boot-annotations/

* https://www.geeksforgeeks.org/spring-boot-crud-operations/

* https://www.simplilearn.com/what-is-tomcat-article

* https://www.geeksforgeeks.org/spring-boot-project-deployment-using-tomcat/

## Prompts:
2. What are the annotations used for CRUD operations in Spring Boot?
    * C(reate) - @PostMapping is the annotation for Post, which implements the Create part of CRUD.
    * R(ead) - @GetMapping is the annotation for Get, which implements the Read part of CRUD.
    * U(pdate) - @PutMapping is the annotation for Put, which implements the Update part of CRUD.
    * D(elete) - @DeleteMapping is the annotation for Delete, which implements the Delete part of CRUD.  
4. What is Tomcat?  How does it relate to Spring Boot?
    * Tomcat is a web server developed by the Apache Software Foundation.  It is written in Java and is often used to serve Java applications.
    * Tomcat is the default server for Spring Boot, so unless you specify otherwise, running your spring boot application locally will be on Tomcat.  You can see this in the console window when Spring Boot launches.


