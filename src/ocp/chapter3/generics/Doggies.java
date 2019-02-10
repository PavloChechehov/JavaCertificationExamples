package ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.List;

public class Doggies {
    List<String> names;

    Doggies() {
        names = new ArrayList<>(); // matches instance variable declaration
    }

    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>(); // matches local variable declaration
    }

    //todo general list without concrete type of object
    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // class cast exception here
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        //general list without concrete type of object
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);
    }
}
