package oca.chapter6;

import java.util.ArrayList;
import java.util.List;

public class TweakLists {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("x");
        l.add("z");
        l.add(1, "y");
        l.add(0, "w");
        System.out.println("l = " + l);
        //w,x,y,z

        l.clear();
        l.add("a");
        l.add("b");
        l.add("c");
        System.out.println("l = " + l);
        System.out.println(l.contains("a") + " "+ l.contains("x"));


        System.out.println("l.get(1) = " + l.get(1));
        System.out.println("l.indexOf(\"c\") = " + l.indexOf("c"));
        //b, 2

        l.remove(1);
        System.out.println("l.size() = " + l.size() + " contents: " + l);
    }
}
