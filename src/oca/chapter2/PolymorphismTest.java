package oca.chapter2;

public class PolymorphismTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal horse = new Horse();
        Horse horse1 = new Horse();

        horse1.buck();
        animal.eat();
        horse.eat();

        System.out.println();
//         can't use this method

//        ((Horse) horse).buck();

        checkTypeOfAnimal(animal);
        checkTypeOfAnimal(horse);
        checkTypeOfAnimal(horse1);
//
        horse1.go();
        animal.go();
        horse.go();

    }

    //you should memorize this that if method is overloaded that jvm check for Reference Type
    // Animal animal - reference type
    // = new Animal() - object type
    private static void checkTypeOfAnimal(Animal animal) {
        System.out.println("animal.toString() = " + animal.toString());
    }

    private static void checkTypeOfAnimal(Horse horse) {
        System.out.println("horse.toString() = " + horse.toString());
    }

}

class Animal {
    public void eat() {
        System.out.println("Animal.eat");
    }

    public void go() {
        System.out.println("Animal.go");
    }
}

class Horse extends Animal {
    public void buck() {
        System.out.println("Horse.buck");
    }

    public void eat() {
        System.out.println("Horse.eat");

//        Horse.super.eat();
    }

    public void go() {
        System.out.println("Horse.go");
    }
}

