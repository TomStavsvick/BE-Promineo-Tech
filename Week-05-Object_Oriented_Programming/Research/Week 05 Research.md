# Week 5 Research
OOP and Advanced OOP

References:
* https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/

* https://www.freecodecamp.org/news/four-pillars-of-object-oriented-programming/

* https://docs.oracle.com/javase/tutorial/java/concepts/index.html

* https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/


## OOP:
1. What are the four pillars of Object-Oriented Programming?  Explain each pillar.

    (a) Encapsulation - Keeping all the related parts of a design or sub-design together in one "capsule".  To me, this is exactly what we do when we make a class.  As an example, for our playing card / deck lab assignment this week, I did not make the value for comparison purposes visible.  I instead provided an override method for comparing 2 cards and determining if one was higher than the other, or if they were equal.  The end user doesn't care how the comparison was made, only that they can see the result.  The comparison, creation of a card, and all of it's properties are kept together in the class.  I feel this enables abstraction.

    (b) Inheritance - When a child class can use the properties and methods of it's parent class.  Sometimes those properties/methods are overridden as they could be specific to the child implementation.  For example, a 2D shape class might have a name and an area property.  A square could be a child class of shape that has a width property and a specific implementation to calculate the area (maybe even in the constructor), but can set the "name" property to "square".

    (c) Polymorphism - Having multiple ways of accomplishing many tasks.  The best example we've used so far is using ArrayList vs. LinkedList.  They are both lists and use the list interface so a developer could switch from one implementation to the other with minimal code changes.  The performance would be different between the two, but most of the user's code would stay the same.

    (d) Abstraction - Hiding the details that aren't required to use the class.  As an example, for our playing card / deck lab assignment this week, the user does not care how the cards are shuffled, only THAT they are shuffled.  I could have created multiple methods that split the deck, copy one card from the top of each half and stack them to the bottom of a new deck, but instead created a shuffle method who's mechanism for shuffling is not shared publicly.

2. What is the relationship between a Class and an Object?

    A Class is like a blueprint that describes what the Object will be.  An object is instantiated from a Class.  For example, if you had a class for a baseball, it may have properties for size, weight, color, material(s), but those properties are only placeholders.  When you call the baseball's constructor, it returns the baseball object that is the "physical" instance of the baseball that is unique from any other instance of a baseball.

## Advanced OOP:
3. What are the differences between abstract classes and interfaces?  When should you use one over the other?  

    An interface is like a contract that states the minimum methods and properties that need to be implemented in order to be compatible with that interface.  None of the methods in an interface are coded in the interface beyond the method signature.  An abstract class can implement default versions of methods.  Interfaces define what but not how.  Abstract classes give the what and may provide some of how.  Interfaces should be used when you care about the what, but not the how.  Abstract classes should be used when you want to leverage inheritance and/or specify part of the how but may not have a complete picture of all of the how.

4. Research the SOLID principals of Object-Oriented Programming (OOP) as introduced by Robert Martin.  List the principles, and give a description of each one.

    (a) S - Single-responsibility Principle
        This principal says that a class should have only one reason to change.  My reference described this as having a single purpose.  To me this principal's intent is to keep class design simple by having it focus on doing one thing correctly.  If you put too much in to a single class, it can be difficult to keep it backwards compatible in the future and make it a nightmare to maintain.  A class that does more than one thing is difficult to describe in a simple name which means pouring through documentation and comments to figure out what the code does and why.

    (b) O - Open-closed Principle
        This principal says that software entities should be open for extension, but closed for modification.  In my shape class example, you wouldn't want to add methods to calculate the area for every shape possible in the one class, it is better to extend the class with shape-specific classes (like square, triangle, etc.).

    (c) L - Liskov Substitution Principle
        This principal says derived or child classes must be substitutable for their base or parent classes.  Because child classes inherit their parent class' methods and parameters, it only makes sense that a child class could be used to instantiate a parent and have it work correctly or the child should not inherit from that parent.  This rule feels less like a strict rule on inheritance, but more like an explanation on what proper inheritance is.  

    (d) I - Interface Segregation Principle
        This principal says do not force any client to implement an interface which is irrelevant to them.  By having interfaces that are small and specific to what is needed we reduce overhead, minimize maintenance, and maximize compatibility.  I would also imagine we limit the number of test cases required as well.

    (e) D - Dependency Inversion Principle
        This principal says that high-level modules should not depend on low-level modules.  Both should depend on abstractions.  If an application is meant to print to any printer, it should only need to know the interface to the printer, now how the printer places the ink on the paper in order to work.  Both the application and the driver need to know the what, but how should be independent.