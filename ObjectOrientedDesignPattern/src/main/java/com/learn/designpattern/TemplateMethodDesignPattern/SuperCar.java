package com.learn.designpattern.TemplateMethodDesignPattern;

public class SuperCar extends CarTemplate{
    @Override
    public void collectPart() {
        System.out.println("Dunlop tyres, 10 cylinder engine");
    }

    @Override
    public void design() {
        System.out.println("LCD,Headrest Collars,Glitter Tumbler,Seatbelt Covers");
    }

    @Override
    public void fuelType() {
        System.out.println("petrol");
    }

    @Override
    public void start(){
        System.out.println("Turn on the Ignition with Remote");
    }
}
