package ocp2.chapter4;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Pair<Integer, String> worldCup = new Pair(2018, "Russia");
        System.out.println("worldCup = " + worldCup);

        List<? super Number> numbers = new ArrayList<>();
        numbers.add(new Double(1));


    }
}
