package oca.chapter5.ex1;

public class SwitchCaseWithCharEx {

    public static void main(String[] args) {

        char c = 'c';


        switch (c) {
            case 'a':
                System.out.println('a');break;
            case 'b':
                System.out.println('b');break;
            case 'c':
                System.out.println('c');break;
            default:
                System.out.println("not matched");
        }

    }
}
