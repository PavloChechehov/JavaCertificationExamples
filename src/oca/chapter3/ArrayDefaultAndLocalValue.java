package oca.chapter3;

import java.util.Date;

public class ArrayDefaultAndLocalValue {
    static double[] arr = new double[100];

    public static void main(String[] args) {

        String [] data;
        //bad declaration
//        data = {"1", "2"};
        // good data = new String[]{"1", "2"}
        // or String [] data = {"1", "2"}; in 1 line;


        //example 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }

        //example 2
        int year;

        //must be initialized because would be compiler error!!!
        year=2000;
        System.out.println("year = " + year);

        //example 3
        int x;

        if (args[0] != null){
            x = 7;
        }

        //compiler error - The following code upsets the compiler
        //int y = x;

        //example 4
        Date date = null;
        if (date == null) {
            System.out.println("date is null ");
        }

    }
}
