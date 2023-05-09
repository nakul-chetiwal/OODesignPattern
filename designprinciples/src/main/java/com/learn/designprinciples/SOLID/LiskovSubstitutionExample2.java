package com.learn.designprinciples.SOLID;
/*
In this code, we have a Shape superclass and two subclasses, Rectangle and Square.
Both Rectangle and Square override the getArea() method of the Shape superclass
to return their respective areas. We also have an AreaCalculator class that takes
a Shape object as input and calculates its area using the getArea() method.
Now, let's test the AreaCalculator class by passing in objects of both Rectangle and Square:
As you can see, the AreaCalculator class is able to correctly calculate the areas of both Rectangle
and Square objects, even though they are of different types. This demonstrates the Liskov Substitution Principle,
as the Rectangle and Square objects were able to be substituted for the Shape superclass
without affecting the correctness of the program.

 */
public class LiskovSubstitutionExample2 {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);

        double rectangleArea = areaCalculator.calculateArea(rectangle);
        double squareArea = areaCalculator.calculateArea(square);

        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Square area: " + squareArea);
    }
}
 class Shape {
    public double getArea() {
        return 0;
    }
}

 class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

 class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

 class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }
}