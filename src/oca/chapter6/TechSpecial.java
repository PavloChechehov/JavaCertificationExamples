package oca.chapter6;


class Special{
    private StringBuilder name = new StringBuilder("bob");

    public StringBuilder getName() {
        return name;
    }

    void printName(){
        System.out.println("name = " + name);
    }
}
public class TechSpecial {
    public static void main(String[] args) {
        Special special = new Special();
        StringBuilder name = special.getName();
        name.append("fred");
        special.printName();
    }
}
