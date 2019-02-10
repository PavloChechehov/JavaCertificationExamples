package oca.chapter5.selfTest;

public class Gotcha {
    public static void main(String[] args) {
        try {
            new Gotcha().go();
        }catch (Exception e ){
            System.out.println("ouch");
        }
    }

    void go(){
        go();
    }
}
