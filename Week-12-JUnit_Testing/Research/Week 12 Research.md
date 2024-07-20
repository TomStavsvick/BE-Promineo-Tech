# Week 12 Research
JUnit Testing

References:
* https://martinfowler.com/bliki/TestDrivenDevelopment.html

* https://www.geeksforgeeks.org/behavioral-driven-development-bdd-in-software-engineering/

* https://www.unlogged.io/post/java-mocks-a-guide-to-mocking-in-java


## Prompts:
1. What is the difference between TDD and BDD?
    1. TDD stands for Test Driven Development.  It involves a repetative process of writing tests first, then writing the minimal code to make the test pass, then refactoring code to make it robust.  In my personal experience, TDD helps force developers to write code that is less complex, as they are only writing the code to where it passes the testing.  When unit tests are written as an after thought (for example, as required in medical devices to comply with IEC62304), they can be extremely difficult to write without refactoring the code as the source code may resemble a plate of spaghetti in it's workflow.
    2. BDD stands for Behavior Driven Development.  It uses a "scipt" more like spoken lanugage to provide context around what the end user is wanting/expecting.  The Given-When-Then format, you might say something like given the user is stopped at a red light with the car running, when the light turns green, then the user will step on the gas and expect the car to accelerate.  The intent is to make things more clear and self-document, leading to better code quality.

2. What does mocking a class allow you to do?
    1. Mocking a class allows you to have control over what the class returns so you can isolate your testing to the method/class you are trying to test.  You can also complete the testing without actually having connections to services that might be normally required in order to run the application.  In my personal experience, we wrote embedded code running on microcontrollers.  Hardware for the microcontroller wasn't always available, so we would mock methods that interfaced with hardware (such as data converters or temperature sensors).  This allowed us to test the software without actually having a hardware system available.


