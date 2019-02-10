package ocp.chapter2.patterns.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new Animal instance
        Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));
        // Create a new Animal instance using data from the first instance
        List<String> favoriteFoods = new ArrayList<String>();
        System.out.println(lion.getClass());
        for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
            favoriteFoods.add(lion.getFavoriteFood(i));
        }

        lion = new Animal(lion.getSpecies(), lion.getAge() + 1,
                favoriteFoods);

        System.out.println(lion.getClass());
    }
}
