package ocp.chapter3.searchingAndSorting;


import java.util.*;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();

        rabbits.add(new Rabbit());

        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);

        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> comparator = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy");
        System.out.println(index);
    }
}
