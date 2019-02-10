package ocp.chapter3.arrayListTest;

import java.util.Arrays;

public class SearchingAndSortingArrayList {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1000)); // -2
    }
}
