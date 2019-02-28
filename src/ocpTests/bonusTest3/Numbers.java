package ocpTests.bonusTest3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers implements Comparable<Numbers> {
    int num;
    public Numbers(int n) {
        num = n;
    }
    public int compareTo(Numbers n) {
        return num - n.num;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    public static void main(String[] args) {
        Numbers x = new Numbers(4);
        Numbers y = new Numbers(1);
        List<Numbers> list = new ArrayList<Numbers>();
        list.add(x); list.add(y);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
