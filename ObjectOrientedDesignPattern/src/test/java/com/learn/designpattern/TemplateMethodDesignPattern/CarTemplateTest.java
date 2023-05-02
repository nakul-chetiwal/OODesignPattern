package com.learn.designpattern.TemplateMethodDesignPattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTemplateTest {

    @Test
    public void testSedanBuild() {
        CarTemplate sedan = new Sedan();
        System.out.println("====Build SEDAN=====");
        sedan.buildCar();
    }

    @Test
    public void testSuperCarBuild() {
        CarTemplate superCar = new SuperCar();
        System.out.println("====Build SUV======");
        superCar.buildCar();
    }

    @Test
    public void testSUVBuild() {
        CarTemplate suv = new SUV();
        System.out.println("====Build SUV======");
        suv.buildCar();
    }
}
