package oca.chapter3;

import java.util.Date;

public class CheckGC {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        System.out.println("rt.totalMemory() = " + rt.totalMemory() / 1000);

        System.out.println("rt.freeMemory() = " + rt.freeMemory() / 1000);

        Date d = null;

        for (int i = 0; i < 10000; i++) {
            d = new Date();
            d = null;
//            rt.gc();
        }


        //not be printed if rt.gc() in loop
        System.out.println(" After rt.freeMemory() = " + rt.freeMemory() / 1000);
        rt.gc();
        System.out.println("After GC rt.freeMemory() = " + rt.freeMemory() / 1000);
    }
}
