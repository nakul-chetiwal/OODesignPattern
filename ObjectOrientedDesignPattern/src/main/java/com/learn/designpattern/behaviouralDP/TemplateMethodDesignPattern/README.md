
## Template Design Pattern: (Having a template method is mandatory) 
Behavioural Design Pattern
This Pattern has a method called Template method which is made Public final and it is implemented
in the Abstract class.
This method  defines the steps to execute an algorithm and it can provide default implementation
that might be common for all or some of the subclasses.
This design pattern can be used when we want to define the algorithm for building a car.
The process has a sequence of process (steps) to build a car. 
1. collectPart()
2. assemblePart()
3. design()
4. fuelType()
5. start()
As we notice these steps has to be performed in sequencial order to build a car.

There are different type of car like SUV,SEDAN and SUPERCAR etc. but all the cars follow the same 
building steps. Therefore, We will create an SUV, SEDAN and SUPERCAR classes which will extend the
Abstract Car class. 

Car class may have a private methods, default method and regular methods which can also be overridden.

Why Abstract ? Why not Interface?
In this design pattern we want an implemented final method which has the sequencial steps to build the object. 
Therefore, all the subclass must extend only the abstract Car because we can have an implemented final method 
which can be inheritant by the subclassed. Interface cannot have final implemented method. From Java 8 
we can have a default method in interface but this method is used to implemented the primary implementation 
which could be overridden in the subclasses.
https://stackoverflow.com/questions/23453287/why-is-final-not-allowed-in-java-8-interface-methods
More about interface below:
https://developers.redhat.com/blog/2017/11/10/interfaces-in-java

Difference between Interface and Abstract Method:
1. An interface cannot have state, whereas the abstract class can have state with instance variables.
2. classes can implement more than one interface, but they can extend only one abstract class. This is a design 
decision based on the fact that multiple inheritance (extending more than one class) can cause code deadlocks.
Java's engineers decided to avoid that.
3. Another difference is that interfaces can be implemented by classes or extended by interfaces,
but classes can be only extended.


Link for Template design pattern reference:
https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java#template-method-concrete-classes  

https://www.infoworld.com/article/2077421/abstract-classes-vs-interfaces-in-java.html

https://javachallengers.com/java-template-method/

https://www.youtube.com/watch?v=cGoVDzHvD4A