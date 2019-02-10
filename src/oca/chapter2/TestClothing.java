package oca.chapter2;

class Clothing {

    public Clothing() {

//        this("asd");
    }

    public Clothing(String s) {
        //recursive constructors
//        this();

    }
}

class TShirt extends Clothing {
    private String s;

    TShirt(String s) {

        super(s);
        this.s = s;
    }
}

public class TestClothing {
    public static void main(String[] args) {

    }
}
