package com.learn.designpattern.TemplateMethodDesignPattern;

public class MainRunner {
    public static void main(String[] args){
        System.out.println("============SUV BELOW===========");
        CarTemplate carTemplate=new SUV();
        carTemplate.buildCar();

        System.out.println("============SEDAN BELOW===========");
        carTemplate=new Sedan();
        carTemplate.buildCar();

        System.out.println("============SUPER CAR BELOW===========");
        carTemplate=new SuperCar();
        carTemplate.buildCar();
    }
}
