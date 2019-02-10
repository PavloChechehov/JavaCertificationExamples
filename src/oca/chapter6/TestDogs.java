package oca.chapter6;

import java.util.ArrayList;

public class TestDogs {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("boi", 30, 6));
        dogs.add(new Dog("charis", 120, 7));
        dogs.add(new Dog("clover", 35, 12));
        dogs.add(new Dog("zooey", 45, 8));
        dogs.add(new Dog("tyri", 40, 12));
        dogs.add(new Dog("aiko", 50, 10));
        dogs.add(new Dog("mis", 15, 4));

        System.out.println("dogs = " + dogs);
        System.out.println("min age 7" + minAge(dogs, 7).toString());


    }

    private static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
        ArrayList<Dog> result = new ArrayList<>();
        return result;
    }
}

class Dog {
    private String name;
    private int weight;
    private int age;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
