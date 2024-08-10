# Week 14 Research
Intro to Spring Boot - REST API #1 Week 2

References:
* https://stackify.com/slf4j-java/

* https://www.baeldung.com/intro-to-project-lombok


## Prompts:
1. Why and where would using logging be useful?  What library to we use in this course for logging?
    1. Logging is a useful way of debugging and testing code when you can't run it as a debugger.  It can provide information as to how something went wrong, which can be reviewed post-event by a developer.  This assumes what the developer placed in the log was useful.  Logging a phrase like "got here" might be ok if you only use it once and are still in development but not useful outside of that.  Logging actual data as your code is about to try something, and having useful exception messages can help a developer quickly identify why something went wrong, and then figure out how to address it gracefully.
    2. In this course, we use SLF4J (Simple Logging Facade for Java).  This is a "Facade" (even in it's name) for multiple logging frameworks.  What's nice is you can change frameworks, or select which one at runtime without changing any code.  You really only need to learn the one facade and any supported framework will work.

2. What is Lombok?  How is it used?  What benefits come from using Lombok?
    1. Lombok plugs in to our code and through annotations, injects a lot of "standard" code for us at build-time.  This can include things like setters and getters, constructors, even exception handlers.  Basically, it handles a lot of tedious coding tasks so the developer can spend more time on value-added activities.  Because it injects the code at build time, another application using our .jar files do not need to include lombok.


