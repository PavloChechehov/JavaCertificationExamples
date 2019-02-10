package ocp.chapter3.collection;

import java.util.*;

public class CollectionMethodTest {
    public static void main(String[] args) {
        add();
        remove();
        treeSetMethod();
        mapCollection();
    }

    private static void add() {
        //1 add()
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false
    }

    private static void remove() {
        //2 remove()
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds); // [hawk]

    }

    private static void treeSetMethod() {
        System.out.println("\n treeSet methods");
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 20; i++) set.add(i);
        System.out.println(set.lower(10)); // 9
        System.out.println(set.floor(10)); // 10
        System.out.println(set.ceiling(20)); // 20
        System.out.println(set.higher(20)); // null
    }

    private static void mapCollection() {
        System.out.println("\n map collection");
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        System.out.println("food = " + food);
        for (String key : map.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,


//        System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3

    }
}
