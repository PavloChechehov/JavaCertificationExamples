package oca.chapter6;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        //not compile
//        StringBuilder sb1 = "as";
        sb.append("def");
        sb.insert(sb.length(), 777);

        sb.reverse();
        System.out.println(sb);
    }
}
