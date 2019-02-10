package oca.chapter5;

public class LoopTest {

    public static void main(String[] args) {
//        for (int i = 0, x = 0; i < 7; x ++, i++) {
//            System.out.println("i = " + i);
//        }
        //legal loop but bad practice
//        for(;;){
//            System.out.println("true = " + true);
//        }


        for (int i = 0; i < 2 ; System.out.println("i" + ++i)) {
            System.out.println("in loop i = " + i);
        }
    }
}
