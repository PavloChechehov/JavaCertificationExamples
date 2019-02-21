package ocpTests.ch1;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
//        HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>();
        //List<Object> objects = new ArrayList<? extends Object>();
        HashMap<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
