package ocp.chapter2.lambdasAndFunctionalInterface;


import java.util.function.IntConsumer;
import java.util.function.Predicate;

//TODO very good example of lambda and functional interface
class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

//should be - if you want that only use this interface as functional interface
//@FunctionalInterface
interface CheckTrait {
    public boolean test(Animal a);
}

interface LambdaTest{
    void lambda(int x);
}

public class FindMatchingAnimals {
    private static void print(Animal animal, Predicate<Animal> predicate) {
        if (predicate.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        LambdaTest lt = a -> {};
        LambdaTest lt2 = (int y) -> { return; };

        // in that code  a -> a.canHop() - sending only the logic of class and how it should be calculate or process
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
}