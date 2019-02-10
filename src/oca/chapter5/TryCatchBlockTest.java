package oca.chapter5;

public class TryCatchBlockTest {
    public static void main(String[] args) {
        try {
            System.out.println("TryCatchBlockTest.main");
        } finally {
            //can be without catch but should be finally block
            System.out.println("finally");
        }
//        catch (Exception e) {
//            System.out.println("e = " + e);
//        }
    }
}
