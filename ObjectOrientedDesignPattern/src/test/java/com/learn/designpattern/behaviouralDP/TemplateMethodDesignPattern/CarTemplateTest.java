package com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern;

import com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern.CarTemplate;
import com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern.SUV;
import com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern.Sedan;
import com.learn.designpattern.behaviouralDP.TemplateMethodDesignPattern.SuperCar;
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
