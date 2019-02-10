package oca.chapter5;

public class SwitchCaseTest {
    public static void main(String[] args) {

        String s = "Monday";
        switch (s) {
            default:
                System.out.println("default");
            case "Monday":
                System.out.println("Monday");
        }

    }
}
