package oca.chapter6;

public class StringTest {
    public static void main(String[] args) {
        String s = "abc";
        String s3 = "abc";
        String s2 = new String("abc");
        System.out.println(s3 == s);
        System.out.println(s.equals(s2));


//        String s1 = s;
//        s = s.concat("def");
//        System.out.println("s = " + s);
//        System.out.println("s1 = " + s1);


        String number = "0123456789";

        System.out.println(number.substring(5));
        System.out.println(number.substring(0, 8));
    }

}
