package ocpTests.ch1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        //return equals -1
//        Comparator<Integer> c = (o1, o2) -> o2 - o1;

        Comparator<Integer> c = (o1, o2) -> o1 - o2;
        List<Integer> list = Arrays.asList(5, 4, 2, 3, 7, 1);
        Collections.sort(list, c);
        System.out.println(Collections.binarySearch(list, 5));
    }
}
