## SOLID
 links: https://www.bmc.com/blogs/solid-design-principles/
 https://www.dotnettricks.com/learn/designpatterns/different-types-of-software-design-principles
 https://www.youtube.com/watch?v=7ib-zbV9Ofo
 https://www.youtube.com/watch?v=XI7zep97c-Y
 https://reflectoring.io/open-closed-principle-explained/



Implementing SOLID design principles during development will lead to systems
that are more maintainable, scalable, testable, and reusable.
maintainable- while developing all the developer does not work on same class. 
Testing should be easy. when new functionality is added the old code should not be tested again
Scalable: Application should be able to handle large traffic



### S-Single Responsibility Principles

### O-Open-closed Principle

Objects or entities should be open for extension but close for modification.
Inheritance and Abstraction,composition is the way to implement this

### L-Liskov Substitution Principle

The Liskov Substitution Principle (LSP) states that objects of a superclass 
should be able to be replaced with objects of its subclasses without 
affecting the correctness of the program. In other words, a subclass should
be able to be substituted for its superclass in any context without 
causing errors or unexpected behaviors.
Objects of superclass can be replaced by the objects of the subclass without
effecting the behaviour of the base class

### I- Interface Segregation Principle

Client should not be forced to implement an interface that it does not use
The general idea of interface segregation principle is that it’s better to
have a lot of smaller interfaces than a few bigger ones. Martin explains this 
principle by advising, “Make fine grained interfaces that are client-specific.
Clients should not be forced to implement interfaces they do not use.

Client should not implement unnecessary functions that they dont need


### D- Dependency Injection Principles-

   Class should depend on Interface rather than concrete class
   dependency inversion principle means that developers should 
   “depend on abstractions, not on concretions.”  
   dependency inversion principle means that developers should 
   “depend on abstractions, not on concretions.”
   high level modules should not depend upon low level modules, instead they should depend 
   on abstraction.


