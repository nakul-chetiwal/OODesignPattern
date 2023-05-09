package com.learn.designprinciples.SOLID;

public class InterfaceSegregation {
}

interface Restaurant{
    void vegMeals();
    void NonMeals();
}

class VegRestaurant implements  Restaurant{

    @Override
    public void vegMeals() {
        System.out.println("Vegetarian Restaurant Implementation implemented");
    }

    // Client is forced to implement this class
    @Override
    public void NonMeals() {
        System.out.println("Sorry No Implementation");
    }
}


// After Implementing Interface Segregation

interface VegetarianRestaurantInterface{
    void vegMeal();
    void vegChef();
}

interface NonVegRestaurantInterface{
    void NonVegMeal();
    void NonVegChef();
}

class VegetarianRestaurant implements VegetarianRestaurantInterface{

    @Override
    public void vegMeal() {

    }

    @Override
    public void vegChef() {

    }
}

class NonVegRestaurant implements NonVegRestaurantInterface{

    @Override
    public void NonVegMeal() {
        System.out.println("non veg meal implementation");
    }

    @Override
    public void NonVegChef() {
        System.out.println("NonVegChef implementation");
    }
}




