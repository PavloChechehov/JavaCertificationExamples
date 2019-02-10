package ocp.assestmentTest;

class HeavyAnimal {
}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}

interface Mother{}
public class Animal {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof HeavyAnimal;
        boolean b2 = hippo instanceof Hippo;
        boolean b3 = hippo instanceof Elephant;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        Hippo hippo1 = new Hippo();
//        compiler error inconvertible type
//        System.out.println(hippo1 instanceof Elephant);

        HeavyAnimal hippo2 = new Hippo();
        System.out.println(hippo2 instanceof Object);
        Hippo nullHippo = null;

        System.out.println(nullHippo instanceof Object);

        Hippo hippo3 = new Hippo();
        System.out.println(hippo3 instanceof Mother);
    }
}
