package com.learn.designprinciples.SOLID;

public class LiskovSubstitutionExample1 {
    public static void main(String[] args) {
        Drive.DriveVehicle(new Vehicle());
        Drive.DriveVehicle(new Car());
    }
}
// Vehicle is a base CLass and it is substitutable
class Vehicle{
    void start(){
        System.out.println("Starting a vehicle");
    }
    void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Starting a car");
    }
    void stop(){
        System.out.println("Stopping a car");
    }
}

class Truck extends Vehicle{
    void start(){
        System.out.println("Starting a truck");
    }
    void stop(){
        System.out.println("Stopping a truck");
    }

}

class Bike extends Vehicle{
    void start(){
        // NOTE: If any method breaks like shown below then Liskov Substitution principle fails
       // throw new RuntimeException("Bike do not start");
        System.out.println("Starting a bike");
    }
    void stop(){
        System.out.println("Stopping a bike");
    }
}

class Drive {
   static void DriveVehicle(Vehicle v){
       v.start();
       v.stop();
    }
}