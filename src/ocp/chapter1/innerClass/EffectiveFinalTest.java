package ocp.chapter1.innerClass;

public class EffectiveFinalTest {
    public static void main(String[] args) {
            //Effective final
            int one = 20;
            //Not Effective final
            int two = one;
            two++;

            //Effective final
            int three;
            if ( one == 4) three = 3;
            else three = 4;

            //Not Effective final
            int four = 4;
            class Inner { }
            four = 5;
    }
}
