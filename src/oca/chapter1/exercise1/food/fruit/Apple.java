package oca.chapter1.exercise1.food.fruit;

import oca.chapter1.exercise1.food.Fruit;

public class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("this = " + this);
    }
}
