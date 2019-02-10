package ocp.chapter4.lambda;

interface Gorilla {
    String move();
}

public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    public static void main(String[] args) {

        new GorillaFamily().everyonePlay(true);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }
}