package oca.chapter5;

public class BreakAndContinueTest {
    public static void main(String[] args) {
        boolean isTrue = true;
        outer:
        for (int i = 0; i < 5 ; i++) {
            while(isTrue){
                System.out.println("Hello");
//                break outer;
                continue outer;
//                break;
//                continue;
            }
            System.out.println("Outer loop");
        }
        System.out.println("End of the loop");
    }
}
