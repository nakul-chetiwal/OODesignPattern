package com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern;

public class Sedan extends CarTemplate{
    @Override
    public void collectPart() {
        System.out.println("small size tyres, 6 cylinder engine and High power system");
    }

    @Override
    public void design() {
        System.out.println("cloth interior and LCD screen");
    }

    @Override
    public void fuelType() {
        System.out.println("Electric");
    }
}
