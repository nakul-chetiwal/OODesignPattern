package com.learn.designprinciples.SOLID;
import java.io.PrintStream;
//https://reflectoring.io/open-closed-principle-explained/

public class OpenClosePrincipleByAbstractionAndComposition {


}

interface GreeterService {

    void greet();

}
    class Greeterr implements GreeterService{

        private PrintStream target;

        public Greeterr(PrintStream target) {
            this.target = target;
        }

        public void greet() {
            target.println("Hello, World!");
        }
    }


// Here FrenchGreeterr class does not have to syn according to the Greeter class changes
    class FrenchGreeterr implements GreeterService {

        @Override
        public void greet() {
            System.out.println("Bonjour!");
        }
    }