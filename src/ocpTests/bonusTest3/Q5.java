package ocpTests.bonusTest3;

import java.util.LinkedList;
import java.util.Queue;

public class Q5 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(new Integer(6));
        q.add(new Integer(6));
        System.out.println(q.size() + " " + q.contains(6L));
    }
}
