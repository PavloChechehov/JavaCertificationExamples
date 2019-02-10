package oca.chapter2.selfTests;


//TODO best practices ever with overriding and overloading
public class Tenor extends Singer{
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println("t.sing() = " + t.sing());
        System.out.println("s.sing() = " + s.sing());
        checkType(t);
        checkType(s);
    }

    private static void checkType(Tenor t) {
        System.out.println(t.sing() + t.toString() + "= tenor");
    }

    private static void checkType(Singer s) {
        System.out.println(s.sing() + s.toString() + "= singer");
    }

    //try delete static and Run
    public static String sing(){
        return "Tenor";
    }

}

class Singer{
    //try delete static
    public static String sing(){
        return "Singer";
    }
}
