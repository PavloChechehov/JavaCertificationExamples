package oca.chapter2.ex1;

interface P1{}
interface P2{}
interface P3{}
abstract class P4{}
public interface Pet extends P1, P2, P3 {

    void eat();

}

class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("Dog.eat");
    }

    public void beFriendly() {
        System.out.println("Dog.beFriendly");
    }
}

class Beagle extends Dog {


    @Override
    public void beFriendly() {
        System.out.println("Beagle.beFriendly");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Beagle();
        d.beFriendly();
    }
}