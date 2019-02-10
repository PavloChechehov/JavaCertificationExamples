package oca.chapter2.selfTests;

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    private void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
//        Class Dog doesn’t have a sniff method
//        ((Dog) new Hound()).sniff();

    }
}

class Dog {
    public void bark() {
        System.out.println(" woof ");
    }
}

class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff");
    }

    @Override
    public void bark() {
        System.out.println("howl ");
    }
}