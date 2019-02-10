package ocp.chapter6.reviewQuestion;

import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
            try {
                throw new IOException();
            } catch (IOException | RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
}
