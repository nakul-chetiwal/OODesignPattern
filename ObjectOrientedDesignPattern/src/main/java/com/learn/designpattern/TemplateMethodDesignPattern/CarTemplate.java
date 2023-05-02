package com.learn.designpattern.TemplateMethodDesignPattern;



public abstract class CarTemplate {
  //This method is called Template Method. This method is inherited in subclass but can not be overridden
   public final void buildCar(){
       collectPart();
       assemblePart();
       design();
       fuelType();
       start();
    }
    //Method must be implemented by the subclass
     public abstract void collectPart();

    // This method can not be inherited by subclass. This functionality is something that no subclass should know.
     private void assemblePart(){
         System.out.println("Car is assembled by the Car company specialist for all the cars");
     }

     // must be implemented by the subclass. Mandatory implementation otherwise the subclass must
     // be abstract class and unimplemented method must be also abstract
     public abstract void design();

    // must be implemented by the subclass. Mandatory implementation
     public abstract void fuelType();

     // Subclass may implement this method. Optional
     public void start(){
         System.out.println("Turn on the Ignition with keys");
     }

}
