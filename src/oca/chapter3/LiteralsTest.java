package oca.chapter3;

public class LiteralsTest {

    private static int i = 1_000_333;
    private static double d = 1_000_333.324_234;

    static int iB = 0b00011;
    static int iO = 011;

    static float f = 123.12342342f;
    static double dd = 123.12323423432d;


    static char letterN = '\u004E';
    static char a = 'a';
    static char b = '@';


    int m = k + 1;
//    won't compile
//    int m1 = m + p;
    static int k = 3;
    int p = 9;
    static {
        int p = 2;
        System.out.println("p = " + p);
    }
    public static void main(String[] args) {
        System.out.println(i);
        System.out.println("d = " + d);
        System.out.println("iB = " + iB);
        System.out.println("iO = " + iO);
        System.out.println("f = " + f);
        System.out.println("letterN = " + letterN);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //remember that cast when sum a byte
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);
        byte b4 = (byte) 256;
        System.out.println("b4 = " + b4);
    }
}
