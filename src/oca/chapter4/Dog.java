package oca.chapter4;

class Cat{}
public class Dog {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(Color.values() instanceof Object); //true, array always is instance of object
        System.out.println(Color.BLUE instanceof Color); //true
        System.out.println(null instanceof Object); // false
        //Compiler error
//        System.out.println(d instanceof Cat);

    }
}

enum Color {
    RED, BLUE
}

