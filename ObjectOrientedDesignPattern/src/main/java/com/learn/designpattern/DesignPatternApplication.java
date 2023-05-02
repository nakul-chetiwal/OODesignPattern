package com.learn.designpattern;

import com.learn.designpattern.TemplateMethodDesignPattern.CarTemplate;
import com.learn.designpattern.TemplateMethodDesignPattern.SUV;
import com.learn.designpattern.TemplateMethodDesignPattern.Sedan;
import com.learn.designpattern.TemplateMethodDesignPattern.SuperCar;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
