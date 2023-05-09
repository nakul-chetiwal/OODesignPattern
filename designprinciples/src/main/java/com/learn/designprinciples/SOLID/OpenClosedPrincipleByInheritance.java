package com.learn.designprinciples.SOLID;
import java.io.PrintStream;
//https://reflectoring.io/open-closed-principle-explained/
/*Open-closed principle can be achieved by Inheritance but the parent and child
class relationship is tightly coupled. If changes made to parent, then child will be
effect.
Therefore, Using abstraction and Composition is better (loose couple)
*/
public class OpenClosedPrincipleByInheritance {
    public static void main(String[] args) {
//        Greeter g=new Greeter();
//        g.greet();
    }
}



 class Greeter {

    private PrintStream target;

    public Greeter(PrintStream target) {
        this.target = target;
    }
     // public Greeter(){}

    public void greet() {
        target.println("Hello, World!");
    }
}

class FrenchGreeter extends Greeter {

    // below constructor has to be added if the changes made to the Class Greeter
    // it means they are tightly coupled .  Note: the error could be resolved if a default constructor is
    // added to the Greeter Class

    public FrenchGreeter(PrintStream target) {
        super(target);
    }

    @Override
    public void greet() {
        System.out.println("Bonjour!");
    }
}




