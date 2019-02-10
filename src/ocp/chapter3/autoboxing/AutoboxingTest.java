package ocp.chapter3.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);

        Short aShort = new Short((short) 21614);
        System.out.println(aShort);
    }
}
