package com.learn.designpattern.TemplateMethodDesignPattern;

public class SUV extends CarTemplate{
    @Override
    public void collectPart() {
        System.out.println("collect large tyres, doors, high performance power system and engine with 8 cylinder ");
    }

    @Override
    public void design() {
        System.out.println("Leather interior");
    }

    @Override
    public void fuelType() {
        System.out.println("Runs on petrol");
    }
}
